package com.example.redis.impl;

import com.example.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Author: blueaken
 * Date: 12/12/15 11:55 AM
 */
public class Solution {

    //Connecting to Redis on localhost
    private static Jedis jedis = new Jedis("localhost");

    public static Object getValue( final String key ) {
        return jedis.get( key );
    }

    public static void setValue( final String key, final String value ) {
        jedis.set(key, value);
    }
//
//    public void setUser( final User user ) {
//        final String key = String.format( "user:%s", user.getId() );
//        final Map< String, Object > properties = new HashMap< String, Object >();
//        properties.put( "id", user.getId() );
//        properties.put( "name", user.getName() );
//        properties.put( "email", user.getEmail() );
//
//        template.opsForHash().putAll(key, properties);
//    }
//
//    public User getUser( final Long id ) {
//        final String key = String.format( "user:%s", id );
//
//        final String name = ( String )template.opsForHash().get( key, "name" );
//        final String email = ( String )template.opsForHash().get( key, "email" );
//
//        return new User( id, name, email );
//    }

    public static void main(String[] args) throws InterruptedException{

        /*
          k-v store use case
         */
        String key = "counter";
        String value = "1";
        setValue(key, value);
        System.out.println("get value from redis template: " + getValue(key));
        jedis.incr("counter");
        System.out.println("get value from redis template: " + getValue(key));
        System.out.println("===================== ");

        /*
         cache ttl and expire for caching use case
         */
        String cacheKey = "cachekey";
        //adding a new key
        jedis.set(cacheKey, "cached value");
        //setting the TTL in seconds
        jedis.expire(cacheKey, 5);
        //Getting the remaining ttl
        System.out.println("TTL:" + jedis.ttl(cacheKey));
        Thread.sleep(1000);
        System.out.println("TTL:" + jedis.ttl(cacheKey));
        //Getting the cache value
        System.out.println("Cached Value:" + jedis.get(cacheKey));

        //Wait for the TTL finishs
        Thread.sleep(5000);

        //trying to get the expired key
        System.out.println("Expired Key:" + jedis.get(cacheKey));
        System.out.println("===================== ");

        /*
         Object (Set) operation for Object value use case
         */
        cacheKey = "programming languages";
        //Adding a set as value
        jedis.sadd(cacheKey, "Java");
        jedis.sadd(cacheKey, "C#");
        jedis.sadd(cacheKey, "Python");

        //Getting all values in the set: SMEMBERS
        System.out.println("Languages: " + jedis.smembers(cacheKey));

    }
}
