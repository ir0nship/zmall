package com.zzq.zmall.search.config;

import com.zzq.zmall.common.config.BaseSwaggerConfig;
import com.zzq.zmall.common.domain.SwaggerProperties;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * [一句话描述该类的功能]
 *
 * @author : [ironship]
 * @version : [v1.0]
 * @createTime : [2022/11/17 22:34]
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {


    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.zzq.zmall.search.controller")
                .title("zmall搜索系统")
                .description("zmall搜索相关接口文档")
                .contactName("zzq")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return generateBeanPostProcessor();
    }
}
