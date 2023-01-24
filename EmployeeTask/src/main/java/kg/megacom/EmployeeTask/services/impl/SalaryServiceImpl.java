package kg.megacom.EmployeeTask.services.impl;

import kg.megacom.EmployeeTask.dao.SalaryRep;
import kg.megacom.EmployeeTask.models.entities.Salary;
import kg.megacom.EmployeeTask.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRep rep;
    @Override
    public Salary save(Salary salary) {
        return rep.save(salary);
    }

    @Override
    public Salary findById(long id) {
        return rep.findById(id).orElseThrow(()-> new RuntimeException("Salary не найден"));
    }

    @Override
    public void delete(long id) {
        Salary salary = findById(id);
        rep.delete(salary);
    }

    @Override
    public List<Salary> findAll() {
        return rep.findAll();
    }

    @Override
    public Salary update(long id, Salary salary) {
        return null;
    }
}
