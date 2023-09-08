package com.example.bookstore.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.Entity.Login;
import com.example.bookstore.Exception.ResourceNotFoundException;
import com.example.bookstore.Repository.LoginRepo;
import com.example.bookstore.Service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepo loginRepo;
	
	@Override
	public Login login(String email, String password) {
		 Login s = loginRepo.findByEmail(email);
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}
	
	
}
