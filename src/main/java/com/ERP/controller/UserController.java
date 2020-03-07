package com.ERP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/userLogin")
    public String user(){
        System.out.println("lala");
        return "success";
    }
}
