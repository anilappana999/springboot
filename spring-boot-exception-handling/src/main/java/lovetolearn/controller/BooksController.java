package lovetolearn.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lovetolearn.exception.CustomExceptionForGetById;
import lovetolearn.model.Books;
import lovetolearn.service.BooksService;

//mark class as Controller
@RestController
public class BooksController {
//autowire the BooksService class
	@Autowired
	BooksService booksService;

//creating a get mapping that retrieves all the books detail from the database 
	@GetMapping("/book")
	private List<Books> getAllBooks()  {
		//List<Books> li = booksService.getAllBooks();
		
		return booksService.getAllBooks();
	}
	@GetMapping("/demo")
	private String getData()  {
		//List<Books> li = booksService.getAllBooks();
		
		return "demo";
	}

//creating a get mapping that retrieves the detail of a specific book
	@GetMapping("/book/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookid) {
		
		
		List<Books> li = booksService.getAllBooks();
		for(Books b:li) {
			if(b.getBookid()==bookid) {
				return booksService.getBooksById(bookid);	
			}
			
		}
		
		throw new CustomExceptionForGetById("no book based on id","it is custom exception");
	}

//creating a delete mapping that deletes a specified book
	@DeleteMapping("/book/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid) {
		booksService.delete(bookid);
	}

//creating post mapping that post the book detail in the database
	@PostMapping("/books")
	private int saveBook( Books books) {
		booksService.saveOrUpdate(books);
		return books.getBookid();
	}

//creating put mapping that updates the book detail 
	@PutMapping("/books")
	private Books update(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books;
	}
}
