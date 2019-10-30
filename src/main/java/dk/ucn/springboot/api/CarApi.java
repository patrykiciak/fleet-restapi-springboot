package dk.ucn.springboot.api;

import dk.ucn.springboot.model.Car;
import dk.ucn.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarApi {

    private CarService carService;

    @Autowired
    public CarApi(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car add(@RequestBody Car car) {
        return carService.add(car);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car get(@PathVariable long id) {
        return carService.get(id);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        carService.delete(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public void delete(@RequestBody Car car) {
        carService.delete(car);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Car updateOne(@RequestBody Car car) {
        return carService.add(car);
    }
}