package dk.ucn.springboot.repository;

import dk.ucn.springboot.model.CarSwap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarSwapRepository extends JpaRepository<CarSwap, Long> {
}
