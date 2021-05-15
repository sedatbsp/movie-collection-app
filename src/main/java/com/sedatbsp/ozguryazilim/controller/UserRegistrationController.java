package com.sedatbsp.ozguryazilim.controller;

import com.sedatbsp.ozguryazilim.business.abstracts.IUserService;
import com.sedatbsp.ozguryazilim.business.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private IUserService userService;

    public UserRegistrationController(IUserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto userRegistrationDto,@RequestParam String roles){

        if(roles == "ADMIN"){
            userService.save(userRegistrationDto,roles);
            return "redirect:/registration?success";
        }
        userService.save(userRegistrationDto,roles);
        return "redirect:/registration?success";



    }




}
