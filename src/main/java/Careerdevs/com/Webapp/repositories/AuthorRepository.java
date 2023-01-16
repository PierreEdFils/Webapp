package Careerdevs.com.Webapp.repositories;

import Careerdevs.com.Webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
