package io.reading.main.reading;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reading {

	@Id
	private String id;
	private String book_name;
	private String book_author;

	public Reading() {
	}

	public Reading(String id, String book_name, String book_author) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.book_author = book_author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

}
