package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Userentity;
import com.example.demo.service.LoginService;
import com.example.demo.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	UserService userservice;
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String getUser()
	{
		return "index";
	}
	
	@RequestMapping(value="/regist",method=RequestMethod.GET)
	public String getLogin()
	{
		return "regist";
	}
	
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	@ResponseBody
	public Userentity saveUser(Userentity userentity)
	{
		Userentity user=userservice.saveUserentity(userentity);
		return user;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getRegist()
	{
		return "login";
	}
	/*                 */
	@RequestMapping(value="/loginUserz",method=RequestMethod.POST)
	@ResponseBody
	public Userentity loginUserz(Userentity userentity)
	{
		Userentity user=loginService.loginUser(userentity.getName(), userentity.getPassword());
		return user;
		
	}
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public String getSuccess()
	{
		return "success";
	}
	
}