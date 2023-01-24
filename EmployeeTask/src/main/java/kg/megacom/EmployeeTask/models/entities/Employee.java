package kg.megacom.EmployeeTask.models.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @JsonFormat(pattern = "dd.mm.yyyy")
    Date dateOfBirth;
    @ManyToOne
    @JoinColumn(name="salary_id")
    Salary salary;
    @ManyToOne
    @JoinColumn(name="position_id")
    Position position;
}
