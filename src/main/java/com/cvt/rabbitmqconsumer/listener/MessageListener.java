package com.cvt.rabbitmqconsumer.listener;

public interface MessageListener {
    void onMessage(String message);
}
