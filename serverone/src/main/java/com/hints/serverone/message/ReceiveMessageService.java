package com.hints.serverone.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface ReceiveMessageService {
    //与输出通道名相一致
    @Input(value = "message")
    SubscribableChannel getInput();
}