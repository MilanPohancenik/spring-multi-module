package com.pohancenik.springmultimodule.modules.b;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChildController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
    
}
