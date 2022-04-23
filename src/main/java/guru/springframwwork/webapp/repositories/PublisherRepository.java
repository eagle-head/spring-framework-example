package guru.springframwwork.webapp.repositories;

import guru.springframwwork.webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
