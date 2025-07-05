package com.library.service;

public class BookService {
	BookService(){
		System.out.println("BookService is activated");
	}
	public void add(String bookname) {
		System.out.println("The book "+bookname +" is added");
	}
}
