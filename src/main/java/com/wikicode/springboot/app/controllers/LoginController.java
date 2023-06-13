package com.wikicode.springboot.app.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(Model model, Principal principal) {	

		if(principal != null) {
			return "redirect:/admin/orders";
		}
		return "login";
	}
}
