package com.pohancenik.springmultimodule.modules.b;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.pohancenik.springmultimodule.modules.b")
@EnableAutoConfiguration
@PropertySource("classpath:module-b.properties")
public class ModuleBConfiguration {

    @Bean
    public ModuleBBeanOne moduleBBeanOne() {
        return new ModuleBBeanOne();
    }

    @Bean
    public ConflictingBean conflictingBean() {
        return new ConflictingBean();
    }
}

