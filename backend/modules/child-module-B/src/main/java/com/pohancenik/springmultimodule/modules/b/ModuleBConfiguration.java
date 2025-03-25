package com.pohancenik.springmultimodule.modules.b;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pohancenik.springmultimodule.modules.b")
@EnableAutoConfiguration
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

