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
public class MessageServiceImpl extends MessageGrpc.MessageImplBase {
    private static final Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Autowired
    private BeiqiDAO beiqiDAO;

    @Override
    public void getMessageList(CommonRequest req, StreamObserver<MessageListReply> responseObserver) {
        MessageListReply reply = MessageListReply.newBuilder()
                .setMessageList(0, MessageObj.newBuilder()
                        .setId(1218)
                        .setContent("邀请手机尾号4577的朋友加入贝奇成功，恭喜你们各获得一个月的会员奖励")
                        .setType("会员奖励")
                        .setLinkUrl("")
                        .setProducer("会员系统小管家")
                        .setCreatedTimestamp(BeiqiUtils.getCurrentTimestamp())
                        .setReadTimestamp(0)
                        .build())
                .setMessageList(1, MessageObj.newBuilder()
                        .setId(1277)
                        .setContent("邀请手机尾号3672的朋友加入贝奇成功，恭喜你们各获得一个月的会员奖励")
                        .setType("会员奖励")
                        .setLinkUrl("")
                        .setProducer("会员系统小管家")
                        .setCreatedTimestamp(BeiqiUtils.getCurrentTimestamp())
                        .setReadTimestamp(0)
                        .build())
                .setMessageList(2, MessageObj.newBuilder()
                        .setId(1294)
                        .setContent("邀请手机尾号3231的朋友加入贝奇成功，恭喜你们各获得一个月的会员奖励")
                        .setType("会员奖励")
                        .setLinkUrl("")
                        .setProducer("会员系统小管家")
                        .setCreatedTimestamp(BeiqiUtils.getCurrentTimestamp())
                        .setReadTimestamp(0)
                        .build())
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void markMessageRead(MessageIdRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<MessageRequest>  pushMessage(final StreamObserver<MessageObj> responseObserver) {
        return new StreamObserver<MessageRequest>() {
            @Override
            public void onNext(MessageRequest messageRequest) {
                MessageObj message = MessageObj.newBuilder()
                        .setId(1999)
                        .setContent("邀请手机尾号6512的朋友加入贝奇成功，恭喜你们各获得一个月的会员奖励")
                        .setType("会员奖励")
                        .setLinkUrl("")
                        .setProducer("会员系统小管家")
                        .setCreatedTimestamp(BeiqiUtils.getCurrentTimestamp())
                        .setReadTimestamp(0)
                        .build();
                responseObserver.onNext(message);
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
