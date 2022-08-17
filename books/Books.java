package com.books;
 
public class Books {
    public String bookId;
    public String title;
    public String author;
    public String Category;
    public float price;
    
	public Books(String bookId, String title, String author, String category, float price) throws InvalidBookException {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.Category = category;
		this.price = price;
//		if (category.toLowerCase().equals("science")||category.equals("fiction")||category.toLowerCase().equals("tecnology"));
//		else
//			throw new InvalidBookException("category must be Science,fiction,technology or others");
//		if (price<0)
//			throw new InvalidBookException("price cannot be nagetive");
//		else
//			this.price = price;
//		
//		if(bookId.charAt(0)!='B' && bookId.length()==4)
//			throw new InvalidBookException("bookId must start with B and must be of length 4 charector");
//		else 
//			this.bookId=bookId;
		
	}

	
	
}
