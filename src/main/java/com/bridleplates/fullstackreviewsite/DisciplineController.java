package com.bridleplates.fullstackreviewsite;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DisciplineController {
	
	@Autowired
	private DisciplineRepository discRepo;
	
	@Autowired
	private CommentRepository commRepo;


	@RequestMapping(value = "/discipline/{id}", method = RequestMethod.POST)
	public String postComment(@PathVariable(name = "id") Long id, String comment, Model model) {
		Discipline disc1 = discRepo.findOne(id);
		System.out.println(disc1.getComments().size());
		
		Collection<Comment> commentArrayList = disc1.getComments();
		Comment commentFromPage = commRepo.save(new Comment(comment));
		Comment[] comments = new Comment[commentArrayList.size() + 1];
		int i = 0;
			for(Comment comFromArrayList : commentArrayList)
			{
				System.out.println("Comment: " + comFromArrayList.getComment());
				comments[i] = commRepo.save(new Comment(comFromArrayList.getComment()));
				i++;
			}

		comments[commentArrayList.size()] = commentFromPage;
		
		for (int x = 0; x < comments.length; x++)
		{
			System.out.println("Comment[" + x + "]: " + comments[x].getComment());
		}
		
		
		
		Discipline disc = new Discipline(disc1.getTitle(), disc1.getDescription(), disc1.getImgUrl(), disc1.getImgUrl2(), disc1.getImgUrl3(), comments);
		model.addAttribute("discipline", discRepo.save(disc));
		discRepo.delete(disc1);
		return "redirect:/disciplines";
	}
	
	@RequestMapping(value = "/disciplines/{id}", method = RequestMethod.GET)
	public String findComment(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("discipline", discRepo.findOne(id));
		return "discipline";		
	}
}
