package edu.spring.authorlist.repositories;

import edu.spring.authorlist.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
