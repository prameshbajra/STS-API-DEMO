package io.reading.main.reading;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadingController {

	@Autowired
	private ReadingService readingService;

	@RequestMapping("/books")
	public List<Reading> bookedIt() {
		return readingService.bookDesc();
	}

	@RequestMapping("/books/{id}")
	public Reading bookedItById(@PathVariable String id) {
		return readingService.getBookDescById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/books")
	public void addBook(@RequestBody Reading reading) {
		readingService.addBook(reading);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
	public void updateBook(@RequestBody Reading reading, @PathVariable String id) {
		readingService.updateBooks(id, reading);
	}
	
	@RequestMapping(method= RequestMethod.DELETE,value="/books/{id}")
	public void deleteBooks(@PathVariable String id) {
		readingService.deleteBooks(id);
	}
	
}











