package com.bridleplates.fullstackreviewsite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Discipline {
	@ManyToOne
	private Breed breed;

	@ManyToOne
	private Discipline discipline;

	@Id
	@GeneratedValue
	private Long id;

	private String title;
	private String imgUrl;
	private String imgUrl2;
	private String imgUrl3;
	@Lob
	private String description;
	
	@ManyToMany
	private Collection<Comment> comments;
	

	public Discipline() {

	}

	// JPA generates the id in the constructor
	public Discipline(String title, String description, String imgUrl, String imgUrl2, String imgUrl3, Comment... comments) {
		this.title = title;
		this.description = description;
		this.imgUrl = imgUrl;
		this.imgUrl2 = imgUrl2;
		this.imgUrl3 = imgUrl3;
		this.comments = Arrays.asList(comments);
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getImgUrl2() {
		return imgUrl2;
	}

	public String getImgUrl3() {
		return imgUrl3;
	}
	
	public Collection<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return "Discipline [breed=" + breed + ", id=" + id + ", title=" + title + ", imgUrl=" + imgUrl + ", imgUrl2="
				+ imgUrl2 + ", imgUrl3=" + imgUrl3 + ", description=" + description + "]";
	}
}
