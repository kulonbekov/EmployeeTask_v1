package kg.megacom.EmployeeTask.dao;

import kg.megacom.EmployeeTask.models.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRep extends JpaRepository<Salary, Long> {
}
