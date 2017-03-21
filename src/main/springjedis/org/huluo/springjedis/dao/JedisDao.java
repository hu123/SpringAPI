package org.huluo.springjedis.dao;

import redis.clients.jedis.ShardedJedis;

public interface JedisDao {
    ShardedJedis getRedisClient();
    void releaseConnection(ShardedJedis shardedJedis);
    void releaseConnection(ShardedJedis shardedJedis, boolean broken);
}
