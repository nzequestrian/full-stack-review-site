package com.bridleplates.fullstackreviewsite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Breed {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String imgUrl;
	private String imgUrl2;
	private String imgUrl3;
	@Lob
	private String descript;
	
	@ManyToMany
	private Collection<Tag> tags;

	@OneToMany (mappedBy = "breed")
	private Collection<Discipline> disciplines;	
	
	/*@ElementCollection
	@Embedded 
	private Collection<Comment> comments; */ // I just added this ************************************************
	
	public Breed () {}
	
	public Breed(String title, String descript, String imgUrl, String imgUrl2, String imgUrl3, Tag... tags) {
		this.title = title;
		this.descript = descript;
		this.imgUrl = imgUrl;
		this.imgUrl2 = imgUrl2;
		this.imgUrl3 = imgUrl3;
		//this.disciplines = Arrays.asList(disciplines);
		this.tags = Arrays.asList(tags);
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Collection<Discipline> getDisciplines() {
		return disciplines;
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

	public String getDescript() {
		return descript;
	}
	
	public Collection<Tag> getTags() {
		return tags;
	}

	@Override
	public String toString() {
		return title + ", " + descript;
	}

	
}
