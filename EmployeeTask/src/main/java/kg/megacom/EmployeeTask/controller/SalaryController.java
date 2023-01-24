package kg.megacom.EmployeeTask.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.EmployeeTask.models.entities.Salary;
import kg.megacom.EmployeeTask.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Зарплата")
@RestController
@RequestMapping("/api/v1/salary")
public class SalaryController {

    @Autowired
    private SalaryService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    Salary save(@RequestBody Salary salary){return service.save(salary);}

    @GetMapping("/findById")
    @ApiOperation("Поиск зарплаты по ID")
    Salary findById(@RequestParam Long id){return service.findById(id);}

    @DeleteMapping("/delete")
    @ApiOperation("Удаление по ID")
    void delete(@RequestParam Long id){service.delete(id);}

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех зарплат")
    List<Salary> findAll(){return service.findAll();}

    @PutMapping("/update")
    @ApiOperation("Изменить запись")
    Salary update(@RequestParam Long id, @RequestBody Salary salary)
    {return service.update(id,salary);}


}
