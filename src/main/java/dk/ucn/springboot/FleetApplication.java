package dk.ucn.springboot;

import dk.ucn.springboot.model.Car;
import dk.ucn.springboot.model.Driver;
import dk.ucn.springboot.model.Earning;
import dk.ucn.springboot.enumerated.TaxationType;
import dk.ucn.springboot.repository.CarRepository;
import dk.ucn.springboot.repository.DriverRepository;
import dk.ucn.springboot.repository.EarningRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

@SpringBootApplication
public class FleetApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(FleetApplication.class, args);

		// FOO DATA
//		CarRepository carRepository = ctx.getBean(CarRepository.class);
//		carRepository.save(new Car(1L, "Toyota", "Prius", Date.valueOf("2019-01-01"), "GA825BG"));
//
//		DriverRepository driverRepository = ctx.getBean(DriverRepository.class);
//		driverRepository.save(new Driver(1L, "Patryk Iciak", "Gdynia, ul. Zielona 15", "Andrzej", "98101204680", "CDA123412", TaxationType.STUDENT, "mój numer w banku"));
//
//		EarningRepository earningRepository = ctx.getBean(EarningRepository.class);
//		Driver driver = driverRepository.getOne(1L);
//		earningRepository.save(new Earning(1L, driver, LocalDate.of(2019, 1, 1), LocalDate.of(2019, 2, 2), new BigDecimal(1000), false));
	}

}