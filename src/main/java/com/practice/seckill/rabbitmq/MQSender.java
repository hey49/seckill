package com.practice.seckill.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * message sender
 */
@Service
@Slf4j
public class MQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

//    public void send(Object msg) {
//        log.info("send msg:" + msg);
//        rabbitTemplate.convertAndSend("fanoutExchange","", msg);
//    }

    /**
     * send seckill message
     * @param message
     */
    public void sendSeckillMessage(String message){
        log.info("send message:" + message);
        rabbitTemplate.convertAndSend("seckillExchange", "seckill.message", message);
    }

}
