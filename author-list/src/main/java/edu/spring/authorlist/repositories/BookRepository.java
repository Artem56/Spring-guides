package edu.spring.authorlist.repositories;

import edu.spring.authorlist.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
