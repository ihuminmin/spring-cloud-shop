package cn.shop.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author 胡敏敏
 * @Date 2019/7/6
 * @DESC: Cross Origin Resource Share (CORS)
 * CORS是一个跨域资源共享方案，为了解决跨域问题，通过增加一系列请求头和响应头，规范安全地进行跨站数据传输
 */
@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        //允许的域，不要写*，否则cookie就无法使用
        config.addAllowedOrigin("http://manage.leyou.com");
        //是否发送cookie信息
        config.setAllowCredentials(true);
        //允许的请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        //允许的头信息
        config.addAllowedHeader("*");

        //添加映射路径，拦截一切请求
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", config);

        return new CorsFilter(configSource);
    }
}
