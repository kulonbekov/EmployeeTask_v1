package kg.megacom.EmployeeTask.services.impl;

import kg.megacom.EmployeeTask.models.dtos.EmployeeDto;
import kg.megacom.EmployeeTask.models.entities.Employee;
import kg.megacom.EmployeeTask.services.EmployeeToDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeToDtoImpl implements EmployeeToDto {
    @Override
    public EmployeeDto toDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setDateOfBirth(employee.getDateOfBirth());
        employeeDto.setSalary(employee.getSalary().getSum());
        employeeDto.setPosition(employee.getPosition().getName());

        return employeeDto;
    }

    @Override
    public List<EmployeeDto> toDtos(List<Employee> employeeList) {

        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        for(Employee employee : employeeList){
            employeeDtoList.add(toDto(employee));
        }
        return employeeDtoList;
    }
}
