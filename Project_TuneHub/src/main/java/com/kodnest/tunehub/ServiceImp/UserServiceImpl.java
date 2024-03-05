package com.kodnest.tunehub.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.Entity.User;
import com.kodnest.tunehub.Repository.UserRepository;
import com.kodnest.tunehub.Service.UserService;


@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository userrepository;

	@Override
	public String addUser(User user) {
		userrepository.save(user);
		return "User Saved";
	}

	//to check the duplicate entries
	public boolean emailExists(String email) {
		if(userrepository.findByEmail(email)!=null){
			return true;
		}
		else {
			return false;
		}
	}



	public boolean validateUser(String email, String password) {
		User user=userrepository.findByEmail(email);
		String pwd=user.getPassword();
		if(password.equals(pwd)) {
		return true;
	}
	else{
		return false;
	}
}

	public String getRole(String email) {
		User user=userrepository.findByEmail(email); 
		return user.getRole();
	}

	@Override
	public User getuser(String email) {
		// TODO Auto-generated method stub
		return userrepository.findByEmail(email);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userrepository.save(user);
	}
}
