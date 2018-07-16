package com.bridleplates.fullstackreviewsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TagController {

	@Autowired
	private TagRepository tagRepo;
	
	@Autowired
	BreedRepository breedRepo;

	@RequestMapping("/tags")
	public String getTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		model.addAttribute("breeds", breedRepo.findAll());
		return "tags";
	}

	@RequestMapping(value = "/tag/{name}", method = RequestMethod.POST)
	public String postTag(String name, String imgUrl, String imgUrl2, String imgUrl3, String description, Model model, @RequestParam Breed... breeds) {
		Tag tag = new Tag(name, imgUrl, imgUrl2, imgUrl3, description, breeds);
		model.addAttribute("tag", tagRepo.save(tag));
		return "redirect:/tags";
	}
	
	@RequestMapping(value = "/tag/{name}", method = RequestMethod.GET)
	public String findTag(@PathVariable(name = "name") String name, Model model) {
		model.addAttribute("tag", tagRepo.findByName(name));
		return "tag";		
	}

}
