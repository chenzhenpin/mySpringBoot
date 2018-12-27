package com.neo.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    QueService sender;
    @RequestMapping("/sendBus")
    @ResponseBody
    public String send(){
        System.out.println("/sendBus");
        Message msg = MessageBuilder.withPayload("Hello World").build();
        sender.output().send(msg);

        return "ok";
    }
    @RequestMapping("/sendBus1")
    @ResponseBody
    public String send1(){
        System.out.println("/sendBus1");
        Message msg = MessageBuilder.withPayload("Hello World").build();
        sender.output1().send(msg);
        return "ok1";
    }
    @RequestMapping("/sendBus2")
    @ResponseBody
    public String send2(){
        System.out.println("/sendBus2");
        Message msg = MessageBuilder.withPayload("Hello World").build();
        sender.output2().send(msg);
        return "ok2";
    }
}
