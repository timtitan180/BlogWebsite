package com.example.blogwebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
        @GetMapping(value="register")
        public ModelAndView getRegisterPage() {
            ModelAndView registerPage = new ModelAndView("register");
            return registerPage;
        }

        @PostMapping(value="register")
        public String postRegister() {
            return "redirect:/blogs";
        }
}
