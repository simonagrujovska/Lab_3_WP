package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    List<Location> listAll();
    Optional<Location> findById(long id);
}