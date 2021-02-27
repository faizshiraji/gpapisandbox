package com.topupsandbox.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.topupsandbox.admin.entities.User;
import com.topupsandbox.services.AdminUserService;

@Controller
public class AdminController {

	@Autowired
	private AdminUserService adminUserService;
	
	
	public String viewHomePage(Model model) {
		
		return "index";
		
	}
	
	public String logout() {
		return "logout";
		
	}
	
	public String user_edit() {
		return "logout";
		
	}
	
	@RequestMapping("/user_add")
	public String user_add() {
		return "user_add";
		
	}
	
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveuser(@ModelAttribute("userreg") User user, Model model) {
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		String formPassword = user.getPassword();
//		String encodedPassword = encoder.encode(formPassword);
//		user.setPassword(encodedPassword);
//		adminUserService.addUser(user);
		System.out.println(user);
//		String msg = "User Create Successfull.";
//		model.addAttribute("msg", msg);
		return "users";
		
	}
	
	public String user_delete() {
		return "logout";
		
	}
	
	
	@RequestMapping("/users")
	public String userlist(Model model) {
		List<User> users = adminUserService.getUsers();
		model.addAttribute("users", users);
		
		return "index";
		
	}
}
