package com.yelixian.beiqi.client;
import com.yelixian.beiqi.proto.CommonRequest;
import com.yelixian.beiqi.proto.KidlistReply;
import com.yelixian.beiqi.proto.StatusReply;
import com.yelixian.beiqi.proto.UserSettingGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestClient {
    private static final Logger logger = LoggerFactory.getLogger(TestClient.class);
    public static void main(String[] args) throws Exception {
        TestClient client = new TestClient();
        try {
           /* String user = "";*/
            //调用对应的方法
            client.test1();
        } finally {
        }
    }

    public void test(String name) {
        com.yelixian.beiqi.proto.ModifyNickRequest request = com.yelixian.beiqi.proto.ModifyNickRequest.newBuilder().setNick(name).build();
        StatusReply response;
        try {
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 30030).usePlaintext(true).build();
            UserSettingGrpc.UserSettingBlockingStub blockingStub =UserSettingGrpc.newBlockingStub((io.grpc.Channel) channel);
            //调用方法
            response = blockingStub.modifyNick(request);
        } catch (StatusRuntimeException e) {
            return;
        }
        logger.info("Greeting: " + response.getStatus());
    }
    public void test1() {
        CommonRequest request = new CommonRequest();
        KidlistReply response;
        try {
            ManagedChannel channel = ManagedChannelBuilder.forAddress("10.231.219.79", 30030).usePlaintext(true).build();
            UserSettingGrpc.UserSettingBlockingStub blockingStub =UserSettingGrpc.newBlockingStub((io.grpc.Channel) channel);
            //调用方法
            response = blockingStub.getKidlist(request);
        } catch (StatusRuntimeException e) {
            return;
        }
        logger.info("Greeting: " + response.getKidListList());
    }
}
