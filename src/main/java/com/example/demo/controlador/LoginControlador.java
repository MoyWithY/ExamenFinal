package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControlador {
	
	
	
	@GetMapping 
		public String login() {
			return "login";
		}
	}
