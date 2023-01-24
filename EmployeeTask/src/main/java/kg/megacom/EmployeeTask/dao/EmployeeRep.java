package kg.megacom.EmployeeTask.dao;

import kg.megacom.EmployeeTask.models.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRep extends JpaRepository<Employee, Long> {
}
