package com.my.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	
	@RequestMapping(value = "/login")
    public String userLogin(final HttpServletRequest request, final HttpServletResponse response) {
        
        request.setAttribute("message", "I am a index page!");      
        
        
        return "user/login";
    }   

}
