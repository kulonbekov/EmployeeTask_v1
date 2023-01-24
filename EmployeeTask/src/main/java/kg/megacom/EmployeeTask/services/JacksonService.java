package kg.megacom.EmployeeTask.services;

import kg.megacom.EmployeeTask.models.entities.Employee;

import java.io.IOException;
import java.util.List;

public interface JacksonService {

    public String pojoToJson() throws IOException;

    public List<Employee> jsonToPojo() throws IOException;
}
