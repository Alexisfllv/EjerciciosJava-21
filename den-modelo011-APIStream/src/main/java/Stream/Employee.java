package Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Employee {


    private Integer idEmployee;
    private String nameEmployee;
    //@EqualsAndHashCode.Include
    private String jobEmployee;
    private Double salaryEmployee;
    private String departmentEmployee;
}
