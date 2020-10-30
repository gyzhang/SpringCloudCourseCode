package com.example.member.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "kevin")
public class RabbitMQConsumer {
    private Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitHandler
    public void receive(String msg) {
        logger.info("RabbitMQ Consumer consume message: " + msg);
    }

}
