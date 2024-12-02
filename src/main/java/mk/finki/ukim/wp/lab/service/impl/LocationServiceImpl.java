package mk.finki.ukim.wp.lab.service.impl;

import mk.finki.ukim.wp.lab.model.Event;
import mk.finki.ukim.wp.lab.model.Location;
import mk.finki.ukim.wp.lab.repository.LocationRepository;
import mk.finki.ukim.wp.lab.repository.EventRepository;
import mk.finki.ukim.wp.lab.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;
    private final EventRepository eventRepository;

    // Конструктор за инјектирање зависности
    public LocationServiceImpl(LocationRepository locationRepository, EventRepository eventRepository) {
        this.locationRepository = locationRepository;
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Location> listAll() {
        return locationRepository.findAll();
    }

    @Override
    public Optional<Location> findById(long id) {
        return locationRepository.findById(id);
    }

    // Нов метод за настани според локација
    public List<Event> findEventsByLocation(Long locationId) {
        return eventRepository.findAllByLocation_Id(locationId);
    }
}
