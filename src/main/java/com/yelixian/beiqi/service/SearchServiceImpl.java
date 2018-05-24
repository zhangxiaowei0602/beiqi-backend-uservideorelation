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
public class SearchServiceImpl extends SearchGrpc.SearchImplBase {
    private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    @Autowired
    private BeiqiDAO beiqiDAO;

    @Override
    public void search(SearchRequest req, StreamObserver<SearchReply> responseObserver) {
        SearchReply reply = SearchReply.newBuilder()
                .setKeyword(Keyword.newBuilder()
                        .setKeyword("小猪佩奇")
                        .setResultNum(9)
                        .setOperationTimestamp(BeiqiUtils.getCurrentTimestamp())
                        .build())
                .setVideoList(0, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("eq341yex")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第一季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setVideoList(1, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("y71yrh5e")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第二季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setVideoList(2, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("x3rtewwp")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第三季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setVideoList(3, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("ioren7nf")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第四季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setVideoList(4, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("tyiu3daf")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第五季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setVideoList(5, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("mmew3f0p")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第六季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setVideoList(6, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("poda47nc")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇 第七季")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setVideoList(7, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("ipds5dsz")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇大电影之王者风范")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setVideoList(8, Video.newBuilder()
                        .setCcode("ux4y72sg")
                        .setEcode("ds23fy6d")
                        .setVcode("")
                        .setVideoLabel(VideoLabel.EPISODE)
                        .setTitle("小猪佩奇大电影之乘风破浪")
                        .setPicUrl("http://cdn.donghuaxsp.com/wp-content/uploads/2018/01/beepress-image-2-4-2-5287-1515769768-1.jpeg")
                        .setType("cartoon")
                        .build())
                .setErrCode(0)
                .setErrMessage("")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
