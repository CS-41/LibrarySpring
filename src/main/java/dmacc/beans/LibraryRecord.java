/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
public class LibraryRecord {
	@Id
	@GeneratedValue
	public long id;
	@Autowired

	public Library library;
	@Autowired
	public Book book;
	
	public LibraryRecord() {
		super();
	}
		
	public LibraryRecord(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public Library getLibrary() {
		return library;
	}

	public Book getBook() {
		return book;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	
	
}
