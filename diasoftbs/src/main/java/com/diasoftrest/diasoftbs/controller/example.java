package com.diasoftrest.diasoftbs.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class example {

	private static final String template = "Hello, %s!";

	@GetMapping("/home")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
													String name, String name2, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("name2", name2);
		return String.format(template, name + " и " + name2);
}

}
