package com.example.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bookstore {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String title, author, isbn, published, price;
	
	public Bookstore() {}

	public Bookstore(String title, String author, String isbn, String published, String price) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.published = published;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String year) {
		this.published = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	

}
