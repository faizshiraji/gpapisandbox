package com.topupsandbox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topupsandbox.admin.entities.User;
import com.topupsandbox.repos.UserRepo;

@Service
public class AdminUserImpl implements AdminUserService {

	@Autowired
	public UserRepo userRepo;
	
	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUser(int userId) {
		return userRepo.findById(userId).get();
	}

	@Override
	public User getUserByUsername(String username) {
		return userRepo.getUserByUsername(username);
	}

	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User update(User user) {
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		User user = userRepo.getOne(userId);
		userRepo.delete(user);
	}

}
