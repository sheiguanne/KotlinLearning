package com.example.myspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.example.myspringboot.controller"})
public class MvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable(); //配置静态文件处理
    }

    /**
     * 注册servlet适配器
     * 只需要在自定义的servlet上用@Controller("映射路径")标注即可
     */
    @Bean(name = "servletHandlerAdapter")
    public SimpleServletHandlerAdapter servletHandlerAdapter() {
        return new SimpleServletHandlerAdapter();
    }

}
