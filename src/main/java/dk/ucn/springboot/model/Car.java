package dk.ucn.springboot.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="cars")
public class Car {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String carManufacturer;
    private String model;
    private Date productionYear;
    private String plateNumber;

    public Car(long id, String carManufacturer, String model, Date productionYear, String plateNumber) {
        this.id = id;
        this.carManufacturer = carManufacturer;
        this.model = model;
        this.productionYear = productionYear;
        this.plateNumber = plateNumber;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Date productionYear) {
        this.productionYear = productionYear;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    private void removed() {
        System.out.println("Car has been deleted");
    }
}