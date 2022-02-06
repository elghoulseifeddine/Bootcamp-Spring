package com.sip.ams.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/information")
	public String info(Model model) {
		ArrayList<String> names = new ArrayList<>();
		names.add("OCA");
		names.add("OCP");
		names.add("Spring");
		names.add("Angular");
		model.addAttribute("names", names);
		String formation = "FullStack";
		model.addAttribute("workshop", formation);
		return "home/info";
	}

	@RequestMapping("/affichage")
	public String affiche() {
		return "home/affichage";
	}

}
