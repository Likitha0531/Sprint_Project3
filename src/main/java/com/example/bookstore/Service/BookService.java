package com.example.bookstore.Service;

import com.example.bookstore.Entity.Book;

public interface BookService {
             
	Book addProduct(Book book);
	Book updatedb(String productname, Book book);
	void Delete(String productname);
	
}
