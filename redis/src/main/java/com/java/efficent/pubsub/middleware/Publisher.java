package com.java.efficent.pubsub.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Component;

@Component
public class Publisher implements Message {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private ChannelTopic channelTopic;


    @Override
    public void publish(String message) {
        stringRedisTemplate.convertAndSend(channelTopic.getTopic(), message);
    }
}
