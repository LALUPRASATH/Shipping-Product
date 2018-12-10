package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController 
{
 @RequestMapping(value="/home")
 public String getHomePage()
 {
	 return "Home";	 
 }
 @RequestMapping(value="/all/AdminPage")
 public String getAdminPage()
 {
	 return "AdminPage";	 
 }
 @RequestMapping(value="/AboutUs")
 public String getAboutusPage()
 {
	 return "AboutUs";	 
 }
 @RequestMapping("/login")
	public String login(){
		return "Login";
	}
 @RequestMapping(value="/loginerror")
 public String loginError(Model model){
 	model.addAttribute("Error","Invalid EmailID OR Password!!!");
 	return "Login";
   }
	@RequestMapping(value="/logout")
	public String logout(Model model){
		model.addAttribute("message","Loggedout successfully..");
		return "Login";
	}
  @RequestMapping(value="/all/Header")
	public String getStartPage(){
		return "Home";
	}
  @RequestMapping(value="/loginsuccess")
 	public String loginSuccess(){
 		return "Product";
 	}
}
