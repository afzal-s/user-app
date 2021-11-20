package com.bridgelabz.userapplication.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.userapplication.dto.UserDTO;
import com.bridgelabz.userapplication.model.User;
import com.bridgelabz.userapplication.repository.IUserRepo;
import com.bridgelabz.userapplication.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepo userRepo;

	@Override
	public User createUser(UserDTO userDto) {
		User user = new User(userDto);
		System.out.println(user.toString());
		userRepo.save(user);
		return user;
	}

}
