package Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private Integer idEmployee;
    private String nameEmployee;
    private String jobEmployee;
    private Double salaryEmployee;
    private String departmentEmployee;
}
