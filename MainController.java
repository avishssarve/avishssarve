package com.casestudy.controller;

import org.apache.tomcat.jni.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.casestudy.service.UserService;
import com.casestudy.validator.UserValidator;

public class MainController 
{
	

    @RequestMapping(value = "saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute("user") User user, BindingResult result,Model map) {
        UserValidator.validate(user, result);
        UserValidator.validatePassword(user, result);
        //userValidator.validateUser(user, result);
        ModelAndView modelAndView = null;
        if (result.hasErrors()) {
            modelAndView = new ModelAndView("registrationPage");
        } else {
          UserService.saveUser(user);
            User user1 = new User();
            map.addAttribute("loginModel", user1);
            modelAndView = new ModelAndView("loginPage");
        }
        return modelAndView;
    }
}
	