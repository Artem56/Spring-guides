package edu.spring.authorlist.repositories;

import edu.spring.authorlist.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
