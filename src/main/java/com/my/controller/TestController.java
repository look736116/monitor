package com.my.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.service.TestService;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	@Resource
	TestService testService;
	
	@RequestMapping(value = "/index")
    public String recruitdemand(final HttpServletRequest request, final HttpServletResponse response) {
        
        request.setAttribute("message", "I am a index page!");      
        
        System.out.println("=====" + testService.getTestById(1).toString());
        
        return "index";
    }   

}
