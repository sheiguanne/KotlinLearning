package com.example.myspringboot.config;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Order(3)
public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() { //根容器
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { //Spring mvc容器
        return new Class<?>[] { MvcConfig.class };
    }

    @Override
    protected String[] getServletMappings() { //DispatcherServlet映射,从"/"开始
        return new String[] { "/" };
    }
}
