package com.example.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 添加自定义的json转换器
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 追加自己的json转换
        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter = new JacksonHttpMessageConverter();
        converters.add(jackson2HttpMessageConverter);
    }

}
