package com.sedatbsp.ozguryazilim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("pageTitle","Giriş Yap");
        return "login";
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("pageTitle","Anasayfa");
        return "index";
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }


}
