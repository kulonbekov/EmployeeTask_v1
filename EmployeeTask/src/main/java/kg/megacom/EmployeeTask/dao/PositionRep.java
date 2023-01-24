package kg.megacom.EmployeeTask.dao;

import kg.megacom.EmployeeTask.models.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRep extends JpaRepository<Position, Long> {
}
