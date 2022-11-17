package com.zzq.zmall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * [一句话描述该类的功能]
 *
 * @author : [ironship]
 * @version : [v1.0]
 * @createTime : [2022/11/17 22:32]
 */
@Configuration
@MapperScan({"com.zzq.zmall.search.dao", "com.zzq.zmall.mapper"})
public class MyBatisConfig {
}
