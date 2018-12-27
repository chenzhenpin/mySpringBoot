//package com.neo;
//
//import com.neo.stream.Sender;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.integration.support.MessageBuilder;
//import org.springframework.messaging.Message;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class StreamTest {
//    @Autowired
//    Sender sender;
//    @Test
//    public void test(){
//        Message msg = MessageBuilder.withPayload("Hello World").build();
//        sender.output().send(msg);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
