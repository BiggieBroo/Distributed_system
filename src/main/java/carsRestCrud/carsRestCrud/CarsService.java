package carsRestCrud.carsRestCrud.Cars;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsService {
    private final CarsRepository carsRepository;
    @Autowired
    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }
    public List<Cars> getCars() {
        return carsRepository.findAll();
    }
    public void addNewCar(Cars car) {
        System.out.println(car);
    }

    public void deleteCar(Long carId) {
        carsRepository.deleteById(carId);
    }
}
