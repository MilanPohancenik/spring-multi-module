package com.pohancenik.springmultimodule;

import com.pohancenik.springmultimodule.modules.a.ModuleAConfiguration;
import com.pohancenik.springmultimodule.modules.b.ModuleBConfiguration;
import com.pohancenik.springmultimodule.parent.ParentModuleConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class Application {

    public static void main(String... args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .parent(ParentModuleConfiguration.class).web(WebApplicationType.SERVLET)
                .child(ModuleAConfiguration.class).web(WebApplicationType.SERVLET)
                .sibling(ModuleBConfiguration.class).web(WebApplicationType.SERVLET)
                .run(args);
    }

}
