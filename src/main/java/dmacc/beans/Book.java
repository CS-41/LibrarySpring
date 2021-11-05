/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Book {
	
	private String title;
	private String author;
	private double deweyDecimal;
	
	
	public Book() {
		super();
	}
	
	public Book(String title, String author, double deweyDecimal) {
		super();
		this.title = title;
		this.author = author;
		this.deweyDecimal = deweyDecimal;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getDeweyDecimal() {
		return deweyDecimal;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setDeweyDecimal(double deweyDecimal) {
		this.deweyDecimal = deweyDecimal;
	}
	
	
	
}
