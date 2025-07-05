package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookrepository;
	
	public BookRepository getBookrepository() {
		return bookrepository;
	}
	public void setBookrepository(BookRepository bookrepository) {
		this.bookrepository = bookrepository;
	}
	
	public void add(String bookname) {
		System.out.println("The book "+bookname+" is added");
		bookrepository.Save(bookname);
	}
	
}
