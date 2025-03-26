package com.pohancenik.springmultimodule.modules.a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildController {

    @GetMapping("/child/a/hello")
    public String sayHello() {
        return "helloA";
    }

}
