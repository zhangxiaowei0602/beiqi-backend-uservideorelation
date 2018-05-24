package com.yelixian.beiqi.service;

import com.yelixian.beiqi.dao.BeiqiDAO;
import com.yelixian.beiqi.proto.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MembershipServiceImpl extends MembershipGrpc.MembershipImplBase {
    private static final Logger logger = LoggerFactory.getLogger(MembershipServiceImpl.class);

    @Autowired
    private BeiqiDAO beiqiDAO;

    @Override
    public void deal(DealRequest req, StreamObserver<DealReply> responseObserver) {
        DealReply reply = DealReply.newBuilder()
                .setPayUrl("token=XXX&payType=app&amount=1999&object=贝奇会员月卡&sign=shfgwe3535cxcssa54dfd4afdhd423fdhtfj")
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
