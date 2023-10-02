package com.example.autoconfiguation.autoconfig;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@ConditionalOnClass(name = "com.example.autoconfiguation.autoconfig.TienDepTrai1234")
public class AppConfig {

    @ConditionalOnBean(name = "college")
    @Bean
    public SpringBootCourse springBootCourse(){
        return new SpringBootCourse();
    }
}
