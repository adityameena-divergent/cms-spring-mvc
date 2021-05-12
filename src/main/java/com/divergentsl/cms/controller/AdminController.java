package com.divergentsl.cms.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.divergentsl.cms.service.AdminService;



@Controller
//@RequestMapping("/admin")
public class AdminController extends HttpServlet {

	
    @Autowired
    private AdminService adminService;

//    @PostMapping("/adminController")
    @RequestMapping(path = "/adminlogin", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		ModelAndView mv = null;
		
		if (adminService.login(username, password)) {
			mv = new ModelAndView("AdminMenu");
			return mv;
		} else {
			mv = new ModelAndView("index");
			mv.addObject("error", "Incorrect Username & Password");
			return mv;
		}		
	}
    
    @GetMapping("/adminlogin")
    public String adminLogin() {
    	return "AdminLogin";
    }
    
    
    @GetMapping("/adminmenu")
    public String adminMenu() {
    	return "AdminMenu";
    }
    

}
