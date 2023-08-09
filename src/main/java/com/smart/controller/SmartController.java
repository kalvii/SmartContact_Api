package com.smart.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smart.dao.Repostitory;
import com.smart.enties.Contact;
import com.smart.enties.User;

@RestController
public class SmartController {
	
	@Autowired
	private Repostitory repostitory;
	
	
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User newuser) {
		
		User user1=new User();
		user1.setName(newuser.getName());
		user1.setEmail(newuser.getEmail());
		user1.setRole(newuser.getRole());
		user1.setEnabled(newuser.isEnabled());
		
		
		user1.se
		repostitory.save(user1);
		
		
		return user1;
		
	}
	
	@GetMapping("/viewUser")
	public @ResponseBody Iterable<User> getAlluser(){
		return repostitory.findAll();
	}
	
		
	@PostMapping("/addCotact")
	public Contact addContact(@RequestBody Contact newcont) {
		Contact cont1=new Contact();
		cont1.setName(newcont.getName());
		cont1.setSeconsName(newcont.getSeconsName());
		cont1.setEmail(newcont.getEmail());
		cont1.setPhone(newcont.getPhone());
		cont1.setUser(newcont.getUser());
		cont1.setUser(newcont.getUser());
		repostitory.save(cont1);
		
		return cont1;
	}
	
	
	

}
