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
public class Library {
	
	private String libraryName;
	private String libraryAddress;
		
	public Library() {
		super();
	}
	
	public Library(String libraryName, String libraryAddress) {
		super();
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	
	
	
}
