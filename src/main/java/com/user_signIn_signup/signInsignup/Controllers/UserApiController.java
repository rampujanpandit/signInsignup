package com.user_signIn_signup.signInsignup.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserApiController {

    @GetMapping("/test")
    public String test(){
        return "Hii, Welcome to my postman";
    }
}
