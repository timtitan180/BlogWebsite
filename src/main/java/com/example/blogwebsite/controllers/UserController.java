package com.example.blogwebsite.controllers;

import com.example.blogwebsite.entities.User;
import com.example.blogwebsite.repositories.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;

@Controller
@SessionAttributes("user")
public class UserController {
//        public static final LOG = LoggerFactory.getLogger(UserController.class);
        @Autowired
        UserRepository userRepository;

        @GetMapping(value="register")
        public ModelAndView getRegisterPage() {
            ModelAndView registerPage = new ModelAndView("register");
            registerPage.addObject("user",new User());
            return registerPage;
        }

        @PostMapping(value="register")
        public String postRegister(@ModelAttribute("user") User user) {
            ModelAndView postRegisterPage = new ModelAndView("blogs");
            User newUser = new User();
            newUser.setEmail(newUser.getEmail());
            newUser.setPassword(newUser.getPassword());
            userRepository.save(newUser);
            postRegisterPage.addObject("user",newUser);
//            LOG.info("User saved!");
            return "redirect:/blogs/createblogs";
        }
}
