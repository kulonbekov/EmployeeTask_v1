package kg.megacom.EmployeeTask.services;

import kg.megacom.EmployeeTask.models.dtos.EmployeeDto;
import kg.megacom.EmployeeTask.models.entities.Employee;

import java.io.IOException;
import java.util.List;

public interface JacksonDtoService {

    public String pojoToJsonDto() throws IOException;

    public List<EmployeeDto> jsonToPojoDto() throws IOException;
}
