package com.yelixian.beiqi.dao;

import com.yelixian.beiqi.proto.Gender;
import com.yelixian.beiqi.proto.UserInfo;
import com.yelixian.beiqi.utils.BeiqiUtils;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Repository
public class BeiqiDAO {

    private static final Logger logger = LoggerFactory.getLogger(BeiqiDAO.class);

    @Autowired
    private SqlSessionTemplate sqlSession;

    public UserInfo getUserinfoByUcode(String ucode) {
        if (StringUtils.isEmpty(ucode)) {
            logger.warn("parameter ucode is empty - " + ucode);
            return null;
        }

        try{
            List<HashMap<String, Object>> list = sqlSession.selectList("getUserinfoByUcode", ucode);
            if (list.size() != 1) {
                logger.warn("zero result or multiple results found for ucode - " + ucode
                        + " , result num: " +list.size());
                return null;
            }

            HashMap<String, Object> map = list.get(0);

            UserInfo userInfo = UserInfo.newBuilder()
                    .setUcode(ucode)
                    .setNick((String)map.get("nick"))
                    .setAvatar((String)map.get("avatar"))
                    .setPhoneNumber(BeiqiUtils.getMaskedPhoneNumber((String)map.get("phone_number")))
                    .setGender(((Integer)map.get("gender")).intValue() == 2 ? Gender.FEMALE : Gender.MALE)
                    .setSkipHeadTail(((Integer)map.get("skip_head_tail_enabled")).intValue() == 1 ? true : false)
                    .setMembershipExpiryTimestamp((int)(((Date)map.get("membership_last_day")).getTime() / 1000))
                    .build();
            logger.info("success to return userinfo for ucode - " + ucode);
            return userInfo;

        } catch(Exception e) {
            logger.error("fail to get userinfo by ucode - " + ucode, e);
            return null;
        }
    }
}
