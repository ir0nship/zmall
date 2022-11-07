package com.zzq.zmall.config;

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
 * @createTime : [2022/11/7 21:46]
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.zzq.zmall.controller")
                .title("zmall后台系统")
                .description("zmall后台相关接口文档")
                .contactName("zzq")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {

        return generateBeanPostProcessor();
    }
}
