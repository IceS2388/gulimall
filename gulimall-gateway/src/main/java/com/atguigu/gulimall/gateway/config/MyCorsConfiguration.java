package com.atguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * 配置跨域访问。
 */
@Configuration
public class MyCorsConfiguration {

    @Bean
    public CorsWebFilter getCorsWebFilter() {

        UrlBasedCorsConfigurationSource source= new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration=new CorsConfiguration();

        corsConfiguration.addAllowedHeader("*"); //允许跨域的头
        corsConfiguration.addAllowedMethod("*"); //允许跨域的方法get,post,put,update,delete
        corsConfiguration.addAllowedOrigin("*"); //允许跨域的来源
        corsConfiguration.setAllowCredentials(true); //是否允许使用cookie跨域

        source.registerCorsConfiguration("/**",corsConfiguration);

        return new CorsWebFilter(source);
    }
}
