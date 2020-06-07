package com.cxb.oauth2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "index api json";
    }
}
