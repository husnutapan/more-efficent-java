package com.java.efficent.cache.cacheable;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable(cacheNames = "basicCache")
    public String cacheBasic() {
        System.out.println("Before cache object");
        return "Basic Cache";
    }

    @CacheEvict(cacheNames = "basicCache")
    public void cacheEvict() {
        System.out.println("Eviction Cache");
    }

}
