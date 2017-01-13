package com.niit.guiter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.GuiterShoppingCartbackend.DaoImpl.ProductDaoImpl;
import com.niit.GuiterShoppingCartbackend.dao.ProductDao;
import com.niit.GuiterShoppingCartbackend.model.Product;

@Controller

public class HomeController {
	
	

   @RequestMapping("/")
   public String getIndex()
   {
	   return "landing";
   }

   @RequestMapping("/aboutus")
   public String getAboutus()
   {
	   return "aboutus";
   }
   @RequestMapping("/login")
   public String getLogin()
   {
	   return "login";
   }
//   @RequestMapping("/adminhome")
//   public String getAdminhome()
//   {
//	   return "adminhome";
//   }
   @RequestMapping("/registration")
   public String getRegistration()
   {
	   return "registration";
   }
   //for product starts here
   
   
   //for product end s
}
