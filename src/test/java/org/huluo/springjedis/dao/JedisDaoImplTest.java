package org.huluo.springjedis.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.ShardedJedis;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/ctx-jedis.xml"})
public class JedisDaoImplTest {

    @Autowired
    private JedisDaoImpl jedisDao;

    @Test
    public void testGetRedisClient() throws Exception {
        ShardedJedis shardedJedis = jedisDao.getRedisClient();
        assertNotNull(shardedJedis);
    }

}