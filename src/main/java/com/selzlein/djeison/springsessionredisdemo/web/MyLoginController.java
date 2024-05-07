package com.selzlein.djeison.springsessionredisdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyLoginController {

    @GetMapping("/my_login")
    public String myLogin() {
        return "my_login";
    }

}