package com.imlewis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imlewis.model.User;
import com.imlewis.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	@ResponseBody
	public List<User> getUser(){
		List<User> users = userService.getAllUser();
		return users;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	@ResponseBody
	public String createUser(@RequestBody User user) throws JsonProcessingException{
		userService.createUser(user);
		ObjectMapper mapper = new ObjectMapper();
		
		return mapper.writeValueAsString("Hmmmm...");
	}
	
	@RequestMapping(value="/user", method=RequestMethod.PUT)
	@ResponseBody
	public String updateUser(){
		return "User Updated";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteUser(){
		
		return "User Deleted";
	}
}
