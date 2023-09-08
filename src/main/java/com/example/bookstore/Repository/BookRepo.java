package com.example.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookstore.Entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, String> {

	@Query(value =  "select * from Book where productname =?" , nativeQuery = true)
	Book findByName(String productname);
}
