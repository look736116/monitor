package com.my.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.model.User;
import com.my.model.UserState;
import com.my.model.UserType;
import com.my.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping(value = "/login")	
	public String userLogin(String userName, String userPassword) {

		System.out.println(userName);
		System.out.println(userPassword);
		
		for (User user : userService.getAllUsers()) {
			System.out.println(user);
		}
		
	
		return "user/main";
	}

	// 到添加用户界面
	@RequestMapping(value = "/toAddUser")
	public String toAddUser(HttpServletRequest request, HttpServletResponse response) {
		return "user/addUser";
	}

	// 添加新用户
	@RequestMapping(value = "/addUser")
	public String addUser(HttpServletRequest request, HttpServletResponse response, User user) {

		String result = "";
		System.out.println(user);
		user.setUserState(UserState.Normal.getUserState());
		user.setUserType(UserType.User.getUserType());
		userService.addUser(user);
		result = "添加成功！";
		request.setAttribute("result", result);
		return "user/addUser";
	}

	// 检查用户名
	// 添加新用户
		@RequestMapping(value = "/checkUserName")
		@ResponseBody
		public User checkUserName(HttpServletRequest request, HttpServletResponse response) {
			String userName = request.getParameter("userName");
			String userPassword = request.getParameter("userPassword");
			System.out.println(userName +"==" +userPassword);
			String result = "This is a test!";
			User user = new User(22, "qwqeee", "23232", "U", "N");
			
			return user;
		}
}
