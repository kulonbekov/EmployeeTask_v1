package kg.megacom.EmployeeTask.models.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class EmployeeDto {

    @JsonProperty("id")
    Long id;
    @JsonProperty("employee_name")
    String name;
    @JsonProperty("date_of_birth")
    @JsonFormat(pattern = "dd.mm.yyyy")
    Date dateOfBirth;
    @JsonProperty("salary")
    BigDecimal salary;
    @JsonProperty("position")
    String position;

}
