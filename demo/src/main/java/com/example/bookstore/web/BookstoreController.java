package com.example.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bookstore.domain.Bookstore;
import com.example.bookstore.domain.BookstoreRepository;


@Controller
public class BookstoreController {
	@Autowired
	private BookstoreRepository repository;
	
	@RequestMapping("/booklist")
	public String Booklist(Model model) {
		
		model.addAttribute("books", repository.findAll());
		return "booklist";
		
	}
	
	@RequestMapping(value= "/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Bookstore());
		return "addbook";
	}
	@RequestMapping (value= "/save", method = RequestMethod.POST)
	public String Save(Bookstore book) {
		repository.save(book);
		return "redirect:booklist";
		
	}
	
	@RequestMapping(value= "/delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long bookId, Model model) {
		repository.deleteById(bookId);
		return "redirect:../booklist";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String editBook(@PathVariable("id")Long bookId, Model model) {
		model.addAttribute("book", repository.findById(bookId));
		
		return "editbook";
		
	}
	

	
	

}
