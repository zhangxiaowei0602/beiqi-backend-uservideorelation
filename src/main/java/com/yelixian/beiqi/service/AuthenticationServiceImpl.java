package com.yelixian.beiqi.service;

import com.yelixian.beiqi.dao.BeiqiDAO;
import com.yelixian.beiqi.proto.*;
import com.yelixian.beiqi.utils.BeiqiUtils;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationServiceImpl extends AuthenticationGrpc.AuthenticationImplBase {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationServiceImpl.class);

    @Autowired
    private BeiqiDAO beiqiDAO;

    @Override
    public void checkToken(CommonRequest req, StreamObserver<TokenReply> responseObserver) {
        UserInfo ui = UserInfo.newBuilder()
                .setUcode("p87e3trs")
                .setNick("贝宝妈妈")
                .setAvatar("https://img.kanjian.com/crop_120x120_90/group3/M00/11/2C/wKhkGVWLw16AG3zAAAAl8H3WWwo861.jpg")
                .setPhoneNumber("136XXXX8547")
                .setGender(Gender.FEMALE)
                .setSkipHeadTail(true)
                .setMembershipExpiryTimestamp(BeiqiUtils.getFixedTimestamp())
                .build();
        TokenReply reply = TokenReply.newBuilder()
                .setToken("f225cc2843b6735f771a4bbf84fdaabd")
                .setExpiryTimestamp(BeiqiUtils.get1DayLaterTimestamp())
                .setStatus(2)
                .setUserInfo(ui)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getVerificationCode(VerificationCodeRequest req, StreamObserver<VerificationCodeReply> responseObserver) {
        VerificationCodeReply reply = VerificationCodeReply.newBuilder()
                .setStatus(true)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void register(RegisterRequest req, StreamObserver<TokenReply> responseObserver) {
        UserInfo ui = UserInfo.newBuilder()
                .setUcode("p87e3trs")
                .setNick("贝宝妈妈")
                .setAvatar("https://img.kanjian.com/crop_120x120_90/group3/M00/11/2C/wKhkGVWLw16AG3zAAAAl8H3WWwo861.jpg")
                .setPhoneNumber("136XXXX8547")
                .setGender(Gender.FEMALE)
                .setSkipHeadTail(true)
                .setMembershipExpiryTimestamp(BeiqiUtils.getFixedTimestamp())
                .build();
        TokenReply reply = TokenReply.newBuilder()
                .setToken("f225cc2843b6735f771a4bbf84fdaabd")
                .setExpiryTimestamp(BeiqiUtils.get1DayLaterTimestamp())
                .setStatus(2)
                .setUserInfo(ui)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void login(LoginRequest req, StreamObserver<TokenReply> responseObserver) {
        UserInfo ui = UserInfo.newBuilder()
                .setUcode("p87e3trs")
                .setNick("贝宝妈妈")
                .setAvatar("https://img.kanjian.com/crop_120x120_90/group3/M00/11/2C/wKhkGVWLw16AG3zAAAAl8H3WWwo861.jpg")
                .setPhoneNumber("136XXXX8547")
                .setGender(Gender.FEMALE)
                .setSkipHeadTail(true)
                .setMembershipExpiryTimestamp(BeiqiUtils.getFixedTimestamp())
                .build();
        TokenReply reply = TokenReply.newBuilder()
                .setToken("f225cc2843b6735f771a4bbf84fdaabd")
                .setExpiryTimestamp(BeiqiUtils.get1DayLaterTimestamp())
                .setStatus(2)
                .setUserInfo(ui)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getUserinfo(CommonRequest req, StreamObserver<UserinfoReply> responseObserver) {
/*        UserInfo ui = UserInfo.newBuilder()
                .setUcode("p87e3trs")
                .setNick("贝宝妈妈")
                .setAvatar("https://img.kanjian.com/crop_120x120_90/group3/M00/11/2C/wKhkGVWLw16AG3zAAAAl8H3WWwo861.jpg")
                .setPhoneNumber("136XXXX8547")
                .setGender(Gender.FEMALE)
                .setSkipHeadTail(true)
                .setMembershipExpiryTimestamp(BeiqiUtils.getFixedTimestamp())
                .build();*/
        UserInfo ui = beiqiDAO.getUserinfoByUcode(req.getUcode());
        if(ui == null) {
            ui = UserInfo.newBuilder().build();
        }
        UserinfoReply reply = UserinfoReply.newBuilder()
                .setUserInfo(ui)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
