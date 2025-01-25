package com.wjbos.authflow.features.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/authentication")
public class AuthenticationController {

    @GetMapping("/user")
    public String getUser(){
        return "User";
    }
}
