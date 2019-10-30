package dk.ucn.springboot.service;

import dk.ucn.springboot.model.Car;
import dk.ucn.springboot.repository.CarRepository;
import dk.ucn.springboot.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public CarService() {}

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car add(Car car) {
        return carRepository.save(car);
    }

    public Car update(Car car) {
        return carRepository.save(car);
    }

    public void delete(long id) {
        carRepository.deleteById(id);
    }

    public void delete(Car car) {
        carRepository.delete(car);
    }

    public Car get(long id) {
        return carRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Can't find an object of Car with id " + id)
        );
    }

    public List<Car> getAll() {
        return carRepository.findAll();
    }
}
