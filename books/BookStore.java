package com.books;

import java.util.ArrayList;

public class BookStore {
	Books book;
	ArrayList<Books> bookList = new ArrayList<Books>();
	public void addBook(Books b) {
		
		bookList.add(b);
 	}
	
	public BookStore() {
		super();
	}

	public BookStore(Books book) {
		super();
		this.book = book;
	}

	public void searchByAuthor(String author) {
		for(Books b : bookList) {
			if (b.author.equals(author)) {
				System.out.println("book id : " + b.bookId);
				System.out.println("book title : " + b.title);
				System.out.println("book author : " + b.author);
				System.out.println("book price : " + b.price);
				System.out.println("book category : " + b.Category);
			}
		}
	
	}
	
	public void searchByTitle(String title) {
		for(Books b : bookList) {
			if (b.title.equals(title)) {
				System.out.println("book id : " + b.bookId);
				System.out.println("book title : " + b.title);
				System.out.println("book author : " + b.author);
				System.out.println("book price : " + b.price);
				System.out.println("book category : " + b.Category);
			}
		}
	
	}
	
	public void displayAll() {
		for(Books b : bookList) {
			
				System.out.println("book id : " + b.bookId);
				System.out.println("book title : " + b.title);
				System.out.println("book author : " + b.author);
				System.out.println("book price : " + b.price);
				System.out.println("book category : " + b.Category);
			
		}
	}
}
