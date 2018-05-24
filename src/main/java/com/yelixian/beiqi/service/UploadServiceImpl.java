package com.yelixian.beiqi.service;

import com.yelixian.beiqi.dao.BeiqiDAO;
import com.yelixian.beiqi.proto.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UploadServiceImpl extends UploadGrpc.UploadImplBase {
    private static final Logger logger = LoggerFactory.getLogger(UploadServiceImpl.class);

    @Autowired
    private BeiqiDAO beiqiDAO;

    @Override
    public void uploadPic(UploadPicRequest req, StreamObserver<UploadPicReply> responseObserver) {
        UploadPicReply reply = UploadPicReply.newBuilder()
                .setPicUrl("https://img.kanjian.com/crop_120x120_90/group3/M00/11/2C/wKhkGVWLw16AG3zAAAAl8H3WWwo861.jpg")
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
