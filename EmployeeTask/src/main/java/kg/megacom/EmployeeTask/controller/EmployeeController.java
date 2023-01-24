package kg.megacom.EmployeeTask.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.EmployeeTask.models.entities.Employee;
import kg.megacom.EmployeeTask.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Сотрудник")
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    Employee save(@RequestBody Employee employee){return service.save(employee);}

    @GetMapping("/findById")
    @ApiOperation("Поиск сотрудника по ID")
    Employee findById(@RequestParam Long id){return service.findById(id);}

    @DeleteMapping("/delete")
    @ApiOperation("Удаление по ID")
    void delete(@RequestParam Long id){service.delete(id);}

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех сотрудников")
    List<Employee> findAll(){return service.findAll();}

    @PutMapping("/update")
    @ApiOperation("Изменить запись")
    Employee update(@RequestParam Long id, @RequestBody Employee employee)
    {return service.update(id,employee);}


}
