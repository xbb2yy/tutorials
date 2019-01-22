package com.xubing.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.concurrent.*;

/**
 * @author xubing xbbjava@163.com
 * @className JedisTest
 * @description TODO
 * @date 2018/6/11 16:34
 */
public class JedisTest {

    private static final String VERSION = "000";


    private static JedisPool jedisPool;

    static {

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(5000);
        config.setMaxIdle(5);
        config.setMaxWaitMillis(20000);
        config.setTestOnBorrow(true);

        jedisPool = new JedisPool(config, "14.18.238.137", 16379, 30000);

    }

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2000, 10000, 2000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        int taskSize = 1000;
        for (int i = 0; i < taskSize; i++) {
            pool.execute(() -> {
                Jedis jedis = jedisPool.getResource();
                try {
                    String s = jedis.get("1");
                } finally {
                    if (jedis != null) {
                        jedis.close();
                    }
                }
            });
            System.out.println(i);
        }

        pool.shutdown();
    }
}
