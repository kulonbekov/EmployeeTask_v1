package kg.megacom.EmployeeTask.services.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import kg.megacom.EmployeeTask.models.dtos.EmployeeDto;
import kg.megacom.EmployeeTask.models.entities.Employee;
import kg.megacom.EmployeeTask.services.EmployeeService;
import kg.megacom.EmployeeTask.services.EmployeeToDto;
import kg.megacom.EmployeeTask.services.JacksonDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class JacksonDtoServiceImpl implements JacksonDtoService {

    @Autowired
    private EmployeeService service;

    @Autowired
    private EmployeeToDto employeeToDto;



    @Override
    public String pojoToJsonDto() throws IOException {
        List<Employee> employeeList = service.findAll();
        List<EmployeeDto> employeeDtoList = employeeToDto.toDtos(employeeList);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String employeeJson = mapper.writeValueAsString(employeeDtoList);


        FileOutputStream fileOutputStream = new FileOutputStream("pojo_to_json_dto.json");
        mapper.writeValue(fileOutputStream, employeeDtoList);
        fileOutputStream.close();

        return employeeJson;
    }

    @Override
    public List<EmployeeDto> jsonToPojoDto() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        List<EmployeeDto> employeeList = objectMapper.readValue(new File("json_to_pojo_dto.json"), new TypeReference<List<EmployeeDto>>() {
        });
        System.out.println(employeeList);
        return employeeList;

    }
}
