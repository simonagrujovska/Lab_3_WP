package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
