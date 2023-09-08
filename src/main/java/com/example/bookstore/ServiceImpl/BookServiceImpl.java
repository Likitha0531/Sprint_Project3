package com.example.bookstore.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookstore.Entity.Book;
import com.example.bookstore.Exception.ResourceNotFoundException;
import com.example.bookstore.Repository.BookRepo;
import com.example.bookstore.Service.BookService;

@Service
public class BookServiceImpl implements BookService{

	
	@Autowired
	BookRepo bookrepo;
	@Override
	public Book addProduct(Book book) {
		// TODO Auto-generated method stub
		return bookrepo.save(book);
	}
	
	@Override
	public Book updatedb(String productname, Book book) {
		// TODO Auto-generated method stub
Book s1 = bookrepo.findByName(productname);
		
		if(s1!=null) {
			s1.setProductname(book.getProductname());   
			s1.setProductdescription(book.getProductdescription());;// old to new set
			s1.setProducturl(book.getProducturl());;
		return bookrepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void Delete(String productname) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(productname);
		}	
		
		
	}

	

