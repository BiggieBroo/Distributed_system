package carsRestCrud.carsRestCrud.Cars;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/cars")
public class CarsController {
    private final CarsService carsService;
    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }
    @GetMapping
    public List<Cars> getCars() {
        return carsService.getCars();
    }
    @PostMapping
    public void addNewCar(@RequestBody Cars car) {
        carsService.addNewCar(car);
    }
    @DeleteMapping(path = "{carId}")
    public void deleteCar(@PathVariable("carId") Long carId) {
        carsService.deleteCar(carId);
    }
}
