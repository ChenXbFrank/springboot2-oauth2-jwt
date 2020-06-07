package com.cxb.oauth2.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class IndexController {

    @PostMapping("/index")
    public String index() {
        return "index index index";
    }
}
