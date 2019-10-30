package dk.ucn.springboot.api;

import dk.ucn.springboot.model.Driver;
import dk.ucn.springboot.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
public class DriverApi {

    private DriverService driverService;

    @Autowired
    public DriverApi(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Driver add(@RequestBody Driver driver) {
        return driverService.add(driver);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Driver> getAll() {
        return driverService.getAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Driver get(@PathVariable long id) {
        return driverService.get(id);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        driverService.delete(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Driver driver) {
        driverService.delete(driver);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Driver updateOne(@RequestBody Driver driver) {
        return driverService.add(driver);
    }
}