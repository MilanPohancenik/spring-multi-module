package com.pohancenik.springmultimodule.parent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParentController {

    @GetMapping("/parent/hello")
    public String sayHello() {
        return "hello";
    }

}
