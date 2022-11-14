package com.zzq.zmall.security.config;

import com.zzq.zmall.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * [一句话描述该类的功能]
 *
 * @author : [ironship]
 * @version : [v1.0]
 * @createTime : [2022/11/14 22:59]
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}
