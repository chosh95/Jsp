package com.servlet.dto;

public class BookDTO {

	int bookId;
	String bookName;
	String bookLoc;
	
	public BookDTO(int bookId, String bookName, String bookLoc) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookLoc = bookLoc;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookLoc() {
		return bookLoc;
	}

	public void setBookLoc(String bookLoc) {
		this.bookLoc = bookLoc;
	}
}
