package com.niit.guiter;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.GuiterShoppingCartbackend.dao.UserDao;
import com.niit.GuiterShoppingCartbackend.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user")User user,Model model){
		
		userDao.insert(user);
		
		return "landing";
	}

	

}
