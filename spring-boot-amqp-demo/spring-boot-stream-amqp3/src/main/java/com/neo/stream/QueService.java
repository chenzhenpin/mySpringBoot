package com.neo.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;


public interface QueService {
    @Output(Sink.INPUT)
    MessageChannel output();

    @Output("que-1")
    MessageChannel output1();

    @Output("que-2")
    MessageChannel output2();
}


