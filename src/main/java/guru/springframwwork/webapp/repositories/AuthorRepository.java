package guru.springframwwork.webapp.repositories;

import guru.springframwwork.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
