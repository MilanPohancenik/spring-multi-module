package com.pohancenik.springmultimodule.parent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParentController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

}
