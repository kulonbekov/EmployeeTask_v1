package kg.megacom.EmployeeTask.services.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import kg.megacom.EmployeeTask.models.entities.Employee;
import kg.megacom.EmployeeTask.services.EmployeeService;
import kg.megacom.EmployeeTask.services.JacksonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class JacksonServiceImpl implements JacksonService {

    @Autowired
    private EmployeeService service;


    @Override
    public String pojoToJson() throws IOException {
        List<Employee> employeeList = service.findAll();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String employeeJson = mapper.writeValueAsString(employeeList);


        FileOutputStream fileOutputStream = new FileOutputStream("pojo_to_json.json");
        mapper.writeValue(fileOutputStream, employeeList);
        fileOutputStream.close();
        return employeeJson;
    }

    @Override
    public List<Employee> jsonToPojo() throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();

        List<Employee> employeeList = objectMapper.readValue(new File("json_to_pojo.json"), new TypeReference<List<Employee>>() {
        });
        System.out.println(employeeList);
        return employeeList;
    }
}
