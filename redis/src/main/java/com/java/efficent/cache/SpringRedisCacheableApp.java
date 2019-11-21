package com.java.efficent.cache;

import com.java.efficent.cache.cacheable.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
public class SpringRedisCacheableApp implements CommandLineRunner {

    @Autowired
    private CacheService cacheService;


    public static void main(String[] args) {
        SpringApplication.run(SpringRedisCacheableApp.class, args);
    }


    @Override
    public void run(String... args) {
        cacheService.cacheBasic();
        cacheService.cacheBasic();
        cacheService.cacheBasic();

        cacheService.cacheEvict();
    }
}
