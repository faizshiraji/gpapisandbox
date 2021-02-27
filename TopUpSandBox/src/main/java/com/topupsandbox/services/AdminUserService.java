package com.topupsandbox.services;

import java.util.List;

import com.topupsandbox.admin.entities.User;

public interface AdminUserService {

	public List<User> getUsers();
	
	public User getUser(int userId);
	
	public User getUserByUsername(String username);
	
	public User addUser(User user);
	
	public User update(User user);
	
	public void deleteUser(int userId);
		
}
