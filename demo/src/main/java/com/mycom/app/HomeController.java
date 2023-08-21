package com.mycom.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping("/home")
	public String home() {
		System.out.println("HomeController - home 접근");
		return "Hello world?, 안녕 세상?";
	}
	
	@RequestMapping("/hello.do")
	public String hello() {
		System.out.println("HomeController - hello 접근");
		return "hello";		
	}
}
