package com.example.wcfweb.config;

import com.example.wcfweb.entity.Users;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
@EnableAutoConfiguration
public class MyRedisConfiguration {
    @Bean
    public RedisTemplate<Object,Users> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<Object,Users> template=new RedisTemplate<>();
        template.setConnectionFactory(factory);
        Jackson2JsonRedisSerializer<Users> jackson2JsonRedisSerializer=new Jackson2JsonRedisSerializer<Users>(Users.class);
        template.setDefaultSerializer(jackson2JsonRedisSerializer);
        return template;
    }
}
