package com.yelixian.beiqi.service;

import com.yelixian.beiqi.dao.BeiqiDAO;
import com.yelixian.beiqi.proto.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserVideoRelationServiceImpl extends UserVideoRelationGrpc.UserVideoRelationImplBase {
    private static final Logger logger = LoggerFactory.getLogger(UserVideoRelationServiceImpl.class);

    @Autowired
    private BeiqiDAO beiqiDAO;

    @Override
    public void getUserRecord(CommonRequest req, StreamObserver<RecordReply> responseObserver) {
        RecordReply reply = RecordReply.newBuilder()
                .addWatchList(0, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("x3rtewwp")
                        .setVcode("tvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第三季 第12集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1526326398)
                        .build())
                .addWatchList(1, Video.newBuilder()
                        .setCcode("kx4y72sg")
                        .setEcode("t3rtewwp")
                        .setVcode("vvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第二季 第5集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1526067018)
                        .build())
                .addWatchList(2, Video.newBuilder()
                        .setCcode("hx4y72sg")
                        .setEcode("l3rtewwp")
                        .setVcode("nvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第二季 第7集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1525980651)
                        .build())
                .addWatchList(3, Video.newBuilder()
                        .setCcode("ax4y72sg")
                        .setEcode("b3rtewwp")
                        .setVcode("cvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第二季 第10集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1525807511)
                        .build())
                .addWatchList(4, Video.newBuilder()
                        .setCcode("px4y72sg")
                        .setEcode("q6rtewwp")
                        .setVcode("ssv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第五季 第1集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1525806668)
                        .build())
                .addFavorList(0, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("x3rtewwp")
                        .setVcode("tvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第三季 第12集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1526326398)
                        .build())
                .addFavorList(1, Video.newBuilder()
                        .setCcode("kx4y72sg")
                        .setEcode("t3rtewwp")
                        .setVcode("vvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第二季 第5集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1526067018)
                        .build())
                .addFavorList(2, Video.newBuilder()
                        .setCcode("hx4y72sg")
                        .setEcode("l3rtewwp")
                        .setVcode("nvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第二季 第7集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1525980651)
                        .build())
                .addFavorList(3, Video.newBuilder()
                        .setCcode("ax4y72sg")
                        .setEcode("b3rtewwp")
                        .setVcode("cvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第二季 第10集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1525807511)
                        .build())
                .addKeywordList(0, Keyword.newBuilder()
                        .setKeyword("小猪佩奇")
                        .setResultNum(9)
                        .setOperationTimestamp(1526326398)
                        .build())
                .addKeywordList(1, Keyword.newBuilder()
                        .setKeyword("汪汪队立大功")
                        .setResultNum(6)
                        .setOperationTimestamp(1526067018)
                        .build())
                .addKeywordList(2, Keyword.newBuilder()
                        .setKeyword("熊出没")
                        .setResultNum(13)
                        .setOperationTimestamp(1525980618)
                        .build())
                .addKeywordList(3, Keyword.newBuilder()
                        .setKeyword("海绵宝宝")
                        .setResultNum(7)
                        .setOperationTimestamp(1525807511)
                        .build())
                .addKeywordList(4, Keyword.newBuilder()
                        .setKeyword("赛车总动员")
                        .setResultNum(2)
                        .setOperationTimestamp(1525806668)
                        .build())
                .addKeywordList(5, Keyword.newBuilder()
                        .setKeyword("海底小纵队")
                        .setResultNum(8)
                        .setOperationTimestamp(1525806002)
                        .build())
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getUserSearchRecord(CommonRequest req, StreamObserver<SearchRecordReply> responseObserver) {
        SearchRecordReply reply = SearchRecordReply.newBuilder()
                .addKeywordList(0, Keyword.newBuilder()
                        .setKeyword("小猪佩奇")
                        .setResultNum(9)
                        .setOperationTimestamp(1526326398)
                        .build())
                .addKeywordList(1, Keyword.newBuilder()
                        .setKeyword("汪汪队立大功")
                        .setResultNum(6)
                        .setOperationTimestamp(1526067018)
                        .build())
                .addKeywordList(2, Keyword.newBuilder()
                        .setKeyword("熊出没")
                        .setResultNum(13)
                        .setOperationTimestamp(1525980618)
                        .build())
                .addKeywordList(3, Keyword.newBuilder()
                        .setKeyword("海绵宝宝")
                        .setResultNum(7)
                        .setOperationTimestamp(1525807511)
                        .build())
                .addKeywordList(4, Keyword.newBuilder()
                        .setKeyword("赛车总动员")
                        .setResultNum(2)
                        .setOperationTimestamp(1525806668)
                        .build())
                .addKeywordList(5, Keyword.newBuilder()
                        .setKeyword("海底小纵队")
                        .setResultNum(8)
                        .setOperationTimestamp(1525806002)
                        .build())
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getVideoInfo(VideoRequest req, StreamObserver<VideoReply> responseObserver) {
        VideoReply reply = VideoReply.newBuilder()
                .setVideo(Video.newBuilder()
                        .setCcode("kx4y72sg")
                        .setEcode("t3rtewwp")
                        .setVcode("vvv7unts")
                        .setVideoLabel(VideoLabel.VIDEO)
                        .setTitle("小猪佩奇 第二季 第5集")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setDuration(458)
                        .setHeadDuration(72)
                        .setTailDuration(55)
                        .setOperationTimestamp(1526067018)
                        .build())
                .setInBlacklist(false)
                .setExceedLimit(false)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void like(SingleVideoRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void favor(SingleVideoRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void unfavor(SingleVideoRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void report(ReportVideoRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void addBlacklist(AddBlacklistRequest req, StreamObserver<StatusReply> responseObserver) {
        StatusReply reply = StatusReply.newBuilder()
                .setStatus(1)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getChannelInfo(GetChannelInfoRequest req, StreamObserver<ChannelReply> responseObserver) {
        ChannelReply reply = ChannelReply.newBuilder()
                .setCcode("fd461fdv")
                .setTitle("小猪佩奇")
                .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                .setDescription("小猪佩奇是一个可爱的但是有些小专横的小猪。她已经五岁了，" +
                        "与她的猪妈妈，猪爸爸，和弟弟乔治生活在一起。故事内容多数环绕日常生活，" +
                        "比如小孩子们参加学前游戏小组、探访祖父母和表亲、在游乐场游玩、踏单车等等。")
                .setAuthor("阿斯特利、贝克、戴维斯")
                .setProducer("E1 Kids")
                .addEpisodeList(0, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("eq341yex")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第一季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .addEpisodeList(1, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("y71yrh5e")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第二季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .addEpisodeList(2, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("x3rtewwp")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第三季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .addEpisodeList(3, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("ioren7nf")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第四季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .addEpisodeList(4, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("tyiu3daf")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第五季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .addEpisodeList(5, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("mmew3f0p")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第六季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .addEpisodeList(6, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("poda47nc")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第七季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .addEpisodeList(7, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("ipds5dsz")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇大电影之王者风范")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .addEpisodeList(8, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("ds23fy6d")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇大电影之乘风破浪")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setInBlacklist(false)
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
