package com.cvt.rabbitmqconsumer.listener.impl;

import com.cvt.rabbitmqconsumer.listener.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MessageListenerImpl implements MessageListener{
    private static final Logger logger = LoggerFactory.getLogger(MessageListenerImpl.class);
    @Override
    public void onMessage(String message) {
        logger.info(new Date().toString());
        try{
            Thread.sleep(5000);
        } catch (Exception ex){
            logger.error(ex.getMessage());
        }
        logger.info("Message recieved: "+message);
    }
}
