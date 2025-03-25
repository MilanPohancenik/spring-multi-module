package com.pohancenik.springmultimodule.parent;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.pohancenik.springmultimodule.parent")
@EnableAutoConfiguration
public class ParentModuleConfiguration {

    @Bean
    public ParentBean parentBean() {
        return new ParentBean();
    }
}

