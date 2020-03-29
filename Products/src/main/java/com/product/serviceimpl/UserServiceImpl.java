package com.product.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.product.entity.User;
import com.product.repository.UserRepository;
import com.product.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	public User register(User user) {
		
		String passwd=	user.getPassword();
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(passwd));
		return userRepository.save(user);
		
	}

	@Override
	public List<User> usersList() {
		return userRepository.findAll();
	}

}
