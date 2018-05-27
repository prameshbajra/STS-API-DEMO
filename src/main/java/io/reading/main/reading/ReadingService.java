package io.reading.main.reading;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadingService {

	@Autowired
	private ReadingRepository readingRepository;

	public List<Reading> bookDesc() {
		List<Reading> readBooks = new ArrayList<>();
		readingRepository.findAll().forEach(readBooks::add);
		return readBooks;
	}

	public Reading getBookDescById(String id) {
		return readingRepository.findById(id).orElse(null);
	}

	public void addBook(Reading reading) {
		readingRepository.save(reading);
	}

	public void updateBooks(String id, Reading reading) {
		readingRepository.save(reading);
	}

	public void deleteBooks(String id) {
		readingRepository.deleteById(id);
	}
}
