package com.bookapp.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookapp.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book,Integer>{
	
	//derived query
	List <Book> findByAuthor(String author);
	List <Book> findByCategory(String category);
	List <Book> findByTitleAndAuthor(String title,String author);
	List<Book> findByCategoryOrderByTitleAsc(String category);
	
	
	//jpql
	@Query("from Book b where b.title=?1 and b.price>?2")
	List<Book> findBooksByTitleAndPrice(String title,Double price);
	
	


}
