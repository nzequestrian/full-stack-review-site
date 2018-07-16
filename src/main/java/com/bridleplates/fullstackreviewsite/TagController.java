package com.bridleplates.fullstackreviewsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TagController {

	@Autowired
	private TagRepository tagRepo;

	@RequestMapping("/tags")
	public String getTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping(value = "/tag/{name}", method = RequestMethod.POST)
	public String findOrPostTag(String name, Model model) {
		System.out.println("Name: " + name);
		model.addAttribute("tag", tagRepo.save(new Tag(name)));
		return "tags";
	}

}
