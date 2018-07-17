package com.bridleplates.fullstackreviewsite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private Long Id;

	@Lob
	private String comment;

	public Comment() {
	}

	public Comment(String comment) {
		this.comment = comment;
	}

	public Long getId() {
		return Id;
	}

	public String getComment() {
		return comment;
	}

	@Override
	public String toString() {
		return comment;
	}

}
