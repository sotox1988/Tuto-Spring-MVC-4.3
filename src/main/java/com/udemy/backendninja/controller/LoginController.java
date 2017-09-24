package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.backendninja.constant.ViewConstant;

@Controller
public class LoginController {
	
	private static final Log LOG = LogFactory.getLog(LoginController.class);
	
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout) {
		LOG.info("METHOD: showLoginForm() -- PARAMS: error=" + error + ", logout=" + logout);
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		LOG.info("Returning to login view");
		return ViewConstant.LOGIN;
	}
	
	@GetMapping({"/logincheck", "/"})
	public String loginCheck() {
		LOG.info("METHOD: loginCheck()");
		LOG.info("Returning to contacts view");
		return "redirect:/contacts/showcontacts";
	}
	
	
	
	/*
	******************************************************************************************
	@GetMapping("/")
	public String redirectToLogin() {
		LOG.info("METHOD: redirectToLogin()");
		return "redirect:/login";
	}
	
	******************************************************************************************
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout) {
		LOG.info("METHOD: showLoginForm() -- PARAMS: error=" + error + ", logout=" + logout);
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		model.addAttribute("userCredentials", new UserCredential());
		LOG.info("Returning to login view");
		return ViewConstant.LOGIN;
	}
	
	******************************************************************************************
	
	@PostMapping("/logincheck")
	public String loginCheck(@ModelAttribute(name="userCredentials") UserCredential userCredential) {
		LOG.info("METHOD: showLoginForm() -- PARAMS: " + userCredential.toString());
		if(userCredential.getUsername().equals("user") && userCredential.getPassword().equals("user")){
			LOG.info("Returning to contacts view");
			return "redirect:/contacts/showcontacts";
		}
		LOG.info("Redirect to login error");
		return "redirect:/login?error";
	}
	
	******************************************************************************************
	*/

}
