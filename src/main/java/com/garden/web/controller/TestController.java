package com.garden.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class TestController {
	
	@RequestMapping(value="/home")
	public String toHome(){
		return "home";
	}
	
}
