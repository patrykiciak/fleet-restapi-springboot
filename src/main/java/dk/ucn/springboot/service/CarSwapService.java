package dk.ucn.springboot.service;

import dk.ucn.springboot.model.CarSwap;
import dk.ucn.springboot.repository.CarSwapRepository;
import dk.ucn.springboot.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarSwapService {

    @Autowired
    private CarSwapRepository carSwapRepository;

    public CarSwapService() {}

    public CarSwapService(CarSwapRepository carSwapRepository) {
        this.carSwapRepository = carSwapRepository;
    }

    public CarSwap add(CarSwap carSwap) {
        return carSwapRepository.save(carSwap);
    }

    public CarSwap update(CarSwap carSwap) {
        return carSwapRepository.save(carSwap);
    }

    public void delete(long id) {
        carSwapRepository.deleteById(id);
    }

    public void delete(CarSwap carSwap) {
        carSwapRepository.delete(carSwap);
    }

    public CarSwap get(long id) {
        return carSwapRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Can't find an object of CarSwap with id " + id)
        );
    }

    public List<CarSwap> getAll() {
        return carSwapRepository.findAll();
    }
}
