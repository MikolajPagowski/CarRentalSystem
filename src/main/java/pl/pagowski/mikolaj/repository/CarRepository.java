package pl.pagowski.mikolaj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pagowski.mikolaj.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
