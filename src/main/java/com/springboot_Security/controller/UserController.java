package com.springboot_Security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
@GetMapping("/hello")
public String index() {
	System.out.println("before index");
	return "index";
}

}
