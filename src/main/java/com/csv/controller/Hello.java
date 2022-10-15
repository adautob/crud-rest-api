package com.csv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

	@GetMapping("home")
	public String index() {
		return "ola";
	}
}
