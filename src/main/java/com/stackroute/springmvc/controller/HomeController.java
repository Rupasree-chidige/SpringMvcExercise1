package com.stackroute.springmvc.controller;

import com.stackroute.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class HomeController {
@Autowired
public User user;

@RequestMapping("/")
	public String welcome(Model model){

		model.addAttribute("name",user.name());

		return "index";
	}

}
