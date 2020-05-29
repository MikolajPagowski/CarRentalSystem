package pl.pagowski.mikolaj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pagowski.mikolaj.model.ParkingSpace;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Long> {
}
