package com.zensar.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	
	@PostMapping("/valid")
	public String validate(User user,ModelMap map) {
		if (user.getUser().equals("Akshay") && user.getPassword().equals("1234")) {
			map.addAttribute("user",user);
			return "success";
		}
		else {
			map.addAttribute("loginerror","invalid login");
			return "login";
		}
	}
}
