package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
import com.library.repository.BookRepository;


public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println();
		BookService BS = (BookService) context.getBean("BookService");
		BS.add("HarryPotter");
		BookRepository BR = (BookRepository) context.getBean("BookRepository");
		BR.Save();
	}

}
