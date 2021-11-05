/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Nov 5, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Book;
import dmacc.beans.Library;
import dmacc.beans.LibraryRecord;


@Configuration
public class BeanConfiguration {

	@Bean
	public LibraryRecord libraryRecord() {
		LibraryRecord bean = new LibraryRecord();
		return bean;
	}
	
	@Bean
	public Library library() {
		Library bean = new Library();
		return bean;
	}
	
	@Bean
	public Book book() {
		Book bean = new Book();
		return bean;
	}
	
	
}
