package kg.megacom.EmployeeTask.services;

import kg.megacom.EmployeeTask.models.dtos.EmployeeDto;
import kg.megacom.EmployeeTask.models.entities.Employee;

import java.util.List;

public interface EmployeeToDto {

    EmployeeDto toDto(Employee employeeDto);

    List<EmployeeDto> toDtos (List<Employee> employeeList);
}
