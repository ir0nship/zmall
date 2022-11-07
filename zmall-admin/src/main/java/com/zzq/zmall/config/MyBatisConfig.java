package com.zzq.zmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * [一句话描述该类的功能]
 *
 * @author : [ironship]
 * @version : [v1.0]
 * @createTime : [2022/11/7 21:45]
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.zzq.zmall.mapper","com.zzq.zmall.dao"})
public class MyBatisConfig {
}
