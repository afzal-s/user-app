package com.bridgelabz.userapplication.service;

import com.bridgelabz.userapplication.dto.UserDTO;
import com.bridgelabz.userapplication.model.User;

public interface IUserService {

	User createUser(UserDTO userDto);

}
