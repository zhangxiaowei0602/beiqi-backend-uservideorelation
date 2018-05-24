package com.yelixian.beiqi.service;

import com.yelixian.beiqi.dao.BeiqiDAO;
import com.yelixian.beiqi.proto.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BehaviorServiceImpl extends BehaviorGrpc.BehaviorImplBase {
    private static final Logger logger = LoggerFactory.getLogger(BehaviorServiceImpl.class);

    @Autowired
    private BeiqiDAO beiqiDAO;

    @Override
    public StreamObserver<BehaviorObj>  reportBehavior(final StreamObserver<ReportReply> responseObserver) {
        return new StreamObserver<BehaviorObj>() {
            @Override
            public void onNext(BehaviorObj behaviorObj) {
                ReportReply reply = ReportReply.newBuilder()
                        .setCode(behaviorObj.getCode())
                        .setErrCode(0)
                        .setErrMessage("")
                        .build();
                responseObserver.onNext(reply);
            }

            @Override
            public void onError(Throwable t) {
                logger.warn("transport cancelled");
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
