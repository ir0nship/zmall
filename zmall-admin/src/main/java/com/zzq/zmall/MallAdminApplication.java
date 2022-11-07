package com.zzq.zmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * [一句话描述该类的功能]
 *
 * @author : [ironship]
 * @version : [v1.0]
 * @createTime : [2022/11/7 21:49]
 */
@SpringBootApplication
public class MallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class,args);
    }
}
