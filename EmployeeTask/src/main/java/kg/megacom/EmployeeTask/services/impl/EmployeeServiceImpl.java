package kg.megacom.EmployeeTask.services.impl;

import kg.megacom.EmployeeTask.dao.EmployeeRep;
import kg.megacom.EmployeeTask.models.entities.Employee;
import kg.megacom.EmployeeTask.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRep rep;
    @Override
    public Employee save(Employee employee) {
        return rep.save(employee);
    }

    @Override
    public Employee findById(long id) {
        return rep.findById(id).orElseThrow(()-> new RuntimeException("Employee не найден"));
    }

    @Override
    public void delete(long id) {
        Employee employee = findById(id);
        rep.delete(employee);
    }

    @Override
    public List<Employee> findAll() {
        return rep.findAll();
    }

    @Override
    public Employee update(long id, Employee employeeOld) {

        return null;
    }
}
