package com.neo.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(value = {Sink.class,QueService.class})
public class Receiver {
    private static Logger logger = LoggerFactory.getLogger(Receiver.class);
    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        System.out.println("amqp input 消息: " + payload);

    }
    @StreamListener("que-1")
    public void receive1(Object payload) {
        System.out.println("amqp que-1 消息: " + payload);

    }
    @StreamListener("que-2")
    public void receive2(Object payload) {
        System.out.println("amqp que-2 消息: " + payload);

    }
}
