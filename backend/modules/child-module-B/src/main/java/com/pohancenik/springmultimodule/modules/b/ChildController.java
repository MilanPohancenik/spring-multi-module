package com.pohancenik.springmultimodule.modules.b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildController {

    @GetMapping("/child/b/hello")
    public String sayHello() {
        return "helloB";
    }
    
}
