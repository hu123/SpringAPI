package org.huluo.springjedis.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

@Repository
public class JedisDaoImpl implements JedisDao {

    private static final Logger logger = LoggerFactory.getLogger(JedisDaoImpl.class);
    @Autowired
    private ShardedJedisPool shardedJedisPool;

    public ShardedJedis getRedisClient() {
        ShardedJedis shardJedis = null;
        try {
            shardJedis = shardedJedisPool.getResource();
            return shardJedis;
        } catch (Exception e) {
            logger.error("[JedisDS] getRedisClent error:" + e.getMessage());
            if (null != shardJedis)
                shardJedis.close();
        }
        return null;
    }

    public void releaseConnection(ShardedJedis shardedJedis) {
        shardedJedis.close();
    }
    public void releaseConnection(ShardedJedis shardedJedis, boolean broken) {
        shardedJedis.close();
    }
}
