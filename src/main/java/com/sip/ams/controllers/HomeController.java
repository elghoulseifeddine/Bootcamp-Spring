package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
@RequestMapping("/information")
	public String info(Model model) {
	String formation= "FullStack";
	model.addAttribute("workshop",formation);
		return "home/info";
	}

@RequestMapping("/affichage")
    public String affiche() {
	    return "home/affichage";
    }

}
