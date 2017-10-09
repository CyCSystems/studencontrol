package com.cycsystems.studentcontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cycsystems.studentcontrol.constant.ViewConstant;

@Controller
public class MenuController {

	
	@GetMapping("/menu")
	public String showMenu() {
		return ViewConstant.MENU;
	}
}
