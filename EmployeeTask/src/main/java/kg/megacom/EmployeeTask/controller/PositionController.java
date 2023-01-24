package kg.megacom.EmployeeTask.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.EmployeeTask.models.entities.Position;
import kg.megacom.EmployeeTask.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Позиция")
@RestController
@RequestMapping("/api/v1/position")
public class PositionController {

    @Autowired
    private PositionService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    Position save(@RequestBody Position position){return service.save(position);}

    @GetMapping("/findById")
    @ApiOperation("Поиск позиции по ID")
    Position findById(@RequestParam Long id){return service.findById(id);}

    @DeleteMapping("/delete")
    @ApiOperation("Удаление по ID")
    void delete(@RequestParam Long id){service.delete(id);}

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех позиции")
    List<Position> findAll(){return service.findAll();}

    @PutMapping("/update")
    @ApiOperation("Изменить запись")
    Position update(@RequestParam Long id, @RequestBody Position position)
    {return service.update(id,position);}


}
