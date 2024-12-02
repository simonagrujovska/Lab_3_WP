
package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Метод за настани според локација
    List<Event> findAllByLocation_Id(Long locationId);
}
