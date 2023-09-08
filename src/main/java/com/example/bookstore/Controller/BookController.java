package com.example.bookstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bookstore.Entity.Book;
import com.example.bookstore.Service.BookService;

@RestController
public class BookController {
@Autowired
BookService bookservice;
	@PostMapping("/post")
	public Book addProducts(@RequestBody Book Book) {
		
		return bookservice.addProduct(Book);
	}
	
	@PutMapping("/update")
public Book update(@RequestHeader String productname,@RequestBody Book book) {
		
		return bookservice.updatedb(productname, book);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestHeader String productname) {
		bookservice.Delete(productname);
		return "data deleted";
	}
	
}
