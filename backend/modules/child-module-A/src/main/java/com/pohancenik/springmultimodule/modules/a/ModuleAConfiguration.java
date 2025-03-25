package com.pohancenik.springmultimodule.modules.a;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pohancenik.springmultimodule.modules.a")
@EnableAutoConfiguration
public class ModuleAConfiguration {

    @Bean
    public ModuleABeanOne moduleABeanOne() {
        return new ModuleABeanOne();
    }

    @Bean
    public ConflictingBean conflictingBean() {
        return new ConflictingBean();
    }
}

