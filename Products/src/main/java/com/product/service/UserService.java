package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.entity.User;
@Service
public interface UserService {
	
	public User register(User user);

	public List<User> usersList();

}
