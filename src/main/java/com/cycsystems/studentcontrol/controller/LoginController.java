package com.cycsystems.studentcontrol.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cycsystems.studentcontrol.constant.ViewConstant;
import com.cycsystems.studentcontrol.model.UserCredential;

@Controller
public class LoginController {

	private static final Log LOG = LogFactory.getLog(LoginController.class);
	
	@GetMapping("/")
	public String redirectToLogin() {
		LOG.info("METHOD: redirecToLogin()");
		return "redirct:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout) {
		LOG.info("METHOD: showLoginForm() -- PARAMS: error = " + error + ", logout = " + logout);
		
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		model.addAttribute("userCredentials", new UserCredential());
		LOG.info("Returning to login view");		
		return ViewConstant.LOGIN;
	}
}
