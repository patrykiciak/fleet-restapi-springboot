package dk.ucn.springboot.service;

import dk.ucn.springboot.model.Driver;
import dk.ucn.springboot.repository.DriverRepository;
import dk.ucn.springboot.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public DriverService() {}

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public Driver add(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver update(Driver driver) {
        return driverRepository.save(driver);
    }

    public void delete(long id) {
        driverRepository.deleteById(id);
    }

    public void delete(Driver driver) {
        driverRepository.delete(driver);
    }

    public Driver get(long id) {
        return driverRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Can't find an object of Driver with id " + id)
        );
    }

    public List<Driver> getAll() {
        return driverRepository.findAll();
    }
}
