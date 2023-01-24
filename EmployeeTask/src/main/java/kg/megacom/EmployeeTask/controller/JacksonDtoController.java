package kg.megacom.EmployeeTask.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.EmployeeTask.models.dtos.EmployeeDto;
import kg.megacom.EmployeeTask.models.entities.Employee;
import kg.megacom.EmployeeTask.services.JacksonDtoService;
import kg.megacom.EmployeeTask.services.JacksonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Api(tags = "Конвертация в Dto")
@RestController
@RequestMapping("/api/v1/pojoToJsondDto")
public class JacksonDtoController {

    @Autowired
    private JacksonDtoService service;

    @GetMapping("/pojoToJsonDto")
    @ApiOperation("Обьект Dto конвентировать в Json")
    public String JacksonPojoToJson() throws IOException {
        return service.pojoToJsonDto();
    }

    @GetMapping("/jsonToPojoDto")
    @ApiOperation("json конвентировать в обьект Dto")
    public List<EmployeeDto> JacksonJsonToPojo() throws IOException {
        return service.jsonToPojoDto();
    }

}
