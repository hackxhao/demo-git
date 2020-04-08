package com.example.demogit.user;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getUserInfo")
    public String getUserInfo(){
        return "姓名：test";
    }

}
