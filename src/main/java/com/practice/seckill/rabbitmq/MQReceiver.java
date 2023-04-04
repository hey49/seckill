package com.practice.seckill.rabbitmq;

import com.practice.seckill.pojo.SeckillMessage;
import com.practice.seckill.pojo.SeckillOrder;
import com.practice.seckill.pojo.User;
import com.practice.seckill.service.IGoodsService;
import com.practice.seckill.service.IOrderService;
import com.practice.seckill.utils.JsonUtil;
import com.practice.seckill.vo.GoodsVo;
import com.practice.seckill.vo.RespBean;
import com.practice.seckill.vo.RespBeanEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * message receiver
 */
@Service
@Slf4j
public class MQReceiver {

//    @RabbitListener(queues = "queue")
//    public void receive(Object msg){
//        log.info("receive message: " + msg);
//    }
//
//    @RabbitListener(queues = "queue_fanout01")
//    public void receive01(Object msg) {
//        log.info("QUEUE01 Receive message: " + msg);
//    }
//
//    @RabbitListener(queues = "queue_fanout02")
//    public void receive02(Object msg) {
//        log.info("QUEUE02 Receive message: " + msg);
//    }

    @Autowired
    private IGoodsService goodsService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private IOrderService orderService;

    /**
     * order
     */
    @RabbitListener(queues = "seckillQueue")
    public void receive(String message){
        log.info("receive message: " + message);
        SeckillMessage seckillMessage = JsonUtil.jsonStr2Object(message, SeckillMessage.class);
        Long goodsId = seckillMessage.getGoodsId();
        User user = seckillMessage.getUser();
        // check stock count
        GoodsVo goodsVo = goodsService.findGoodVoByGoodsId(goodsId);
        if (goodsVo.getStockCount() < 1) {
            return;
        }
        // check repetitive shopping
        SeckillOrder seckillOrder = (SeckillOrder) redisTemplate.opsForValue().get("order:" + user.getId() + ":" + goodsId);
        if (seckillOrder != null){
            return;
        }
        // order
        orderService.seckill(user, goodsVo);
    }
}
