package com.example.member.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HelloService {
    @Resource
    private StringRedisTemplate strTemplate;
    @Autowired
    private AmqpTemplate amqpTemplate;
    private Logger logger = LoggerFactory.getLogger(HelloService.class);

    public void testRedis(String name){
        strTemplate.opsForValue().set("name", name);
        String nameInRedis = strTemplate.opsForValue().get("name");
        logger.info("Name in Redis=" + nameInRedis);
    }

    public void testRabbitMQ(String name){
        String message = name + " is a GOODMAN.";
        amqpTemplate.convertAndSend("kevin", message);
        logger.info("Send Message: " + message);
    }

}
