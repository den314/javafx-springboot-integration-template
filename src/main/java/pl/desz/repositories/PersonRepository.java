package pl.desz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.desz.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
