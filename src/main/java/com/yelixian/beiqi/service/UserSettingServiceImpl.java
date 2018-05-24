package com.yelixian.beiqi.service;

import com.yelixian.beiqi.dao.BeiqiDAO;
import com.yelixian.beiqi.proto.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSettingServiceImpl extends UserSettingGrpc.UserSettingImplBase {
    private static final Logger logger = LoggerFactory.getLogger(UserSettingServiceImpl.class);

    @Autowired
    private BeiqiDAO beiqiDAO;

    @Override
    public void modifyAvatar(ModifyAvatarRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void modifyNick(ModifyNickRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void modifyGender(ModifyGenderRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void modifyMaxWatchPoint(ModifyMaxWatchPointRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getKidlist(CommonRequest req, StreamObserver<KidlistReply> responseObserver) {
        KidlistReply reply = KidlistReply.newBuilder()
                .setKidList(0, Kid.newBuilder()
                        .setId(1123)
                        .setPicUrl("http://s11.sinaimg.cn/middle/62959db0g889418d988aa&690")
                        .setNick("小飞")
                        .setBirthday("2016-01-30")
                        .setGender(Gender.MALE)
                        .build())
                .setKidList(1, Kid.newBuilder()
                        .setId(1126)
                        .setPicUrl("http://mvimg2.meitudata.com/55c4ac41a77536545.jpg")
                        .setNick("小飞")
                        .setBirthday("2017-11-07")
                        .setGender(Gender.MALE)
                        .build())
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void addKid(SingleKidRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void modifyKid(SingleKidRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteKid(KidIdRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void setMainKid(KidIdRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void setAutoSkip(AutoSkipRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getBlacklist(CommonRequest req, StreamObserver<BlacklistReply> responseObserver) {
        BlacklistReply reply = BlacklistReply.newBuilder()
                .setBlacklist(0, BlackVideo.newBuilder()
                        .setId(3257)
                        .setTitle("超级飞侠")
                        .setVideoLabel(VideoLabel.CHANNEL)
                        .setOperationTimestamp(1524306337) // 2018-04-21 10:25:37
                        .build())
                .setBlacklist(1, BlackVideo.newBuilder()
                        .setId(3269)
                        .setTitle("海绵宝宝 第九季 第11集")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setOperationTimestamp(1525116798) // 2018-04-30 19:33:18
                        .build())
                .setBlacklist(2, BlackVideo.newBuilder()
                        .setId(3824)
                        .setTitle("熊出没 春日乐园 第42集")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setOperationTimestamp(1526326398) // 2018-04-21 10:25:37
                        .build())
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void removeBlacklist(BlacklistRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void checkAppVersion(AppVersionRequest req, StreamObserver<AppVersionReply> responseObserver) {
        AppVersionReply reply = AppVersionReply.newBuilder()
                .setLatestVersion("1.12")
                .setDownloadUrl("http://www.beiqi.tv/app/beiqitv-1.12.apk")
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void feedback(FeedbackRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
