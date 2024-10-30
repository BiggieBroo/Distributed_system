package carsRestCrud.carsRestCrud.Cars;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CarsConfig {
    @Bean
    CommandLineRunner commandLineRunner(CarsRepository repository) {
        return args -> {
            Cars bmw = new Cars(
                    "BMW X7",
                    "BMW",
                    "Black",
                    2024
            );
            Cars mercedes = new Cars(
                    "Mercedes GW",
                    "Mercedes",
                    "Black",
                    2024
            );
            repository.saveAll(List.of(bmw, mercedes));
        };
    }
}
