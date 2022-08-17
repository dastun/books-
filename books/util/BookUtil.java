package com.books.util;

import java.util.Scanner;

import com.books.BookStore;
import com.books.Books;
import com.books.InvalidBookException;

public class BookUtil {

	public static void main(String[] args) throws InvalidBookException {
		// TODO Auto-generated method stub
		BookStore bStore = new BookStore();
//		Books book1 = new Books("b123", "asdasds","junaid", "science" , 100);
//		Books book2 = new Books("b124", "abc","aditya", "fiction" , 100);
//		Books book3 = new Books("b126", "asd","prasad", "technology" , 100);
//		
//		bStore.addBook(book1);
//		bStore.addBook(book2);
//		bStore.addBook(book3);
		Scanner sc = new Scanner(System.in);
		System.out.println("ente -1 to exit");
		String exit = sc.next();
		while(exit != "-1") {
		System.out.println("Enter 1 for user input & add book in store");
		
		System.out.println("Enter 2 to search book by title");
		System.out.println("Enter 3 to search book by author");
		System.out.println("Enter 4 to display all book");
		
		
		
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("enter book id ");
			String bid = sc.next();
			
			System.out.println("enter book title ");
			String title = sc.next();
			
			System.out.println("enter book author");
			String author = sc.next();
			
			System.out.println("enter book category");
			String category = sc.next();
			
			System.out.println("enter book price ");
			float price = sc.nextFloat();
			
			Books book = new Books(bid,title,author,category,price);
			
			bStore.addBook(book);
			
			
		}
		else if(num ==2) {
			System.out.println("enter title");
			String title = sc.nextLine();
			bStore.searchByTitle(title);
		}
		else if(num ==3) {
			System.out.println("enter bookauthor ");
			String author = sc.nextLine();
			bStore.searchByAuthor(author);
		}
		
		else if(num == 4) {
			bStore.displayAll();
		}

	}
	}

}
