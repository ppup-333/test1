package com.sport.springboot.controller.bulletin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BulletinHomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
