package com.bridgelabz.userapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.userapplication.dto.UserDTO;
import com.bridgelabz.userapplication.model.User;
import com.bridgelabz.userapplication.response.Response;
import com.bridgelabz.userapplication.service.IUserService;

@RestController
@RequestMapping("/home")
public class UserContoller {

	@Autowired
	IUserService userService;

	/**
	 * @method : POST
	 * 
	 * @url : http://localhost:8081/home/addUser
	 * 
	 * @body :
	 * {
	 * "firstName": "Afzal",
	 * "lastName": "Shaikh",
	 * "address": "Mumbai"
	 * }
	 * 
	 * @param userDto
	 * @return
	 */
	@PostMapping("/addUser")
	public Response addData(@RequestBody UserDTO userDto) {
		User user = userService.createUser(userDto);
		return new Response((long) 200, "user added successfully", user);
	}
}
