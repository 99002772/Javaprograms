package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

@Service
@Repository

public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public Book addBook(Book book) {
		Book newBook = bookRepository.save(book);
		return newBook;
	}

	@Override
	public boolean deleteBook(Integer bookid) throws BookNotFoundException {
		bookRepository.deleteById(bookid);
		return true;
	}

	

	@Override
	public Book getBookById(Integer bookid) throws BookNotFoundException {
		bookRepository.findById(bookid)
		.orElseThrow(() -> new BookNotFoundException("Id not available"));
		return null;
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws BookNotFoundException {
		return  bookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> getBookbycategory(String category) throws BookNotFoundException {
		return  bookRepository.findByCategoryOrderByTitleAsc(category);
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitleAndAuthor(title,author);
	}

	@Override
	public List<Book> findBooksByTitleAndPrice(String title, Double price) {
		// TODO Auto-generated method stub
		return bookRepository.findBooksByTitleAndPrice(title,price);
	}

	
}
