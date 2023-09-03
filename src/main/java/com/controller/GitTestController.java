package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gitTest")
public class GitTestController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Suraj";
	}

}
