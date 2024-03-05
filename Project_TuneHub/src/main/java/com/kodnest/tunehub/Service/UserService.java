package com.kodnest.tunehub.Service;

import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestParam;

import com.kodnest.tunehub.Entity.User;



public interface UserService 
{
	public String addUser(@ModelAttribute User user);
	public boolean emailExists(String email);	
	public boolean validateUser(String email, String password);
	public String getRole(String email);
	public User getuser(String email);
	public void updateUser(User user);
	
}