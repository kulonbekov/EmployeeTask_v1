package kg.megacom.EmployeeTask.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.EmployeeTask.models.entities.Employee;
import kg.megacom.EmployeeTask.services.JacksonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Api(tags = "Конвертация")
@RestController
@RequestMapping("/api/v1/pojoToJson")
public class JacksonController {

    @Autowired
    private JacksonService service;

    @GetMapping("/pojoToJson")
    @ApiOperation("Обьект конвентировать в Json")
    public String JacksonPojoToJson() throws IOException {
        return service.pojoToJson();
    }

    @GetMapping("/jsonToPojo")
    @ApiOperation("json конвентировать в обьект")
    public List<Employee> JacksonJsonToPojo() throws IOException {
        return service.jsonToPojo();
    }

}
