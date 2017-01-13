package com.niit.guiter;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.GuiterShoppingCartbackend.dao.ProductDao;
import com.niit.GuiterShoppingCartbackend.model.Product;
@Controller
@RequestMapping(value="/admin")
public class ProductController {
	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value = "/product")
	public ModelAndView adminProduct() {
	 ModelAndView mv=new ModelAndView("adminhome");
	 mv.addObject("products",productDao.getAll());
	 mv.addObject("pro",new Product());
	 return mv;
	}
	
	
	 @RequestMapping(value = "/insert",method=RequestMethod.POST)
		public String insertdata(@Valid @ModelAttribute("product") Product product,BindingResult results,Model model) {
		 if(results.hasErrors())
		 {
			 model.addAttribute("product", product);
			 model.addAttribute("productData",productDao.getAll());
			 return ("adminhome");
			 
		 }
		 if(product.getProductid()==0){
			 productDao.insert(product);
		 }
		 else{
			 productDao.update(product);
		 }
		return "redirect:/admin/product";
	}

	 @RequestMapping(value = "/delete/{pro}")
		public String adminProductDelete(@PathVariable("pro") Integer id ) {
		 productDao.delete(id);
		 return "redirect:/admin/product";
	}

	 @RequestMapping("/edit/{id}")
		public String editProduct(@PathVariable("id") int id, Model model) {
			model.addAttribute("pro", productDao.getById(id));
			model.addAttribute("products", productDao.getAll());
			return "adminhome";
		}
	}



