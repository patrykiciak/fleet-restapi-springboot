package dk.ucn.springboot.api;

import dk.ucn.springboot.model.CarSwap;
import dk.ucn.springboot.service.CarSwapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carswaps")
public class CarSwapApi {

    private CarSwapService carSwapService;

    @Autowired
    public CarSwapApi(CarSwapService carSwapService) {
        this.carSwapService = carSwapService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarSwap add(@RequestBody CarSwap carSwap) {
        return carSwapService.add(carSwap);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CarSwap> getAll() {
        return carSwapService.getAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CarSwap get(@PathVariable long id) {
        return carSwapService.get(id);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        carSwapService.delete(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody CarSwap carSwap) {
        carSwapService.delete(carSwap);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public CarSwap updateOne(@RequestBody CarSwap carSwap) {
        return carSwapService.add(carSwap);
    }
}