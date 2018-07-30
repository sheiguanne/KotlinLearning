package com.example.myspringboot.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 被@Configuration 标注的类相当于Spring的xml配置文件，里面配置了很多个bean
 * @EnableAsync 表示可以异步执行
 * @Import 引入其他配置类
 * @ComponentScan 扫描这些包，将其下带有Spring特定注解的类注册为bean
 * @EnableScheduling 可以调度
 * @EnableCaching 打开缓存
 *
 */
@Configuration
@EnableAsync(proxyTargetClass = true)
@Import({
        JDBCConfig.class,
})
@ComponentScan(basePackages = {"com.example.myspringboot.service"})
@EnableScheduling
@EnableCaching
public class RootConfig {

}
