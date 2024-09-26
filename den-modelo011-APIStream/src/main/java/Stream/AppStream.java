package Stream;

import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppStream {

    private void m1getDevs(List<Employee> list,String searchText){

        //BUSCAR TODOS LOS TIPO , SELECCIONAR

                                                                        //dentro de jobemployee , se encuentra el texto buscado
        Predicate<Employee> funcionbooleandeEncontrar = e -> e.getJobEmployee().toLowerCase().contains(searchText.toLowerCase());

        List<Employee> nuevaLista =  list.stream()
                .filter(funcionbooleandeEncontrar)
                        .collect(Collectors.toList());  //JDK8
                //.toList();  //JDK16

        //
        nuevaLista.forEach(employee -> System.out.println(employee));

        //formas mas breve
        list.stream()
                .filter(e -> e.getJobEmployee().toLowerCase().contains(searchText.toLowerCase()))
                .forEach(employee -> System.out.println(employee));
    }

    //

    private void m2getinverser(List<Employee> listado){

        Function<Employee,Integer> funcionEmpleado = e -> e.getIdEmployee();
        Function<Employee,Integer> funcionEmpleado2 = Employee::getIdEmployee;
        //
        listado.stream()
                .sorted(Comparator.comparing(Employee::getIdEmployee).reversed())
                //.sorted(Comparator.comparing(e -> e.getIdEmployee()).reversed())
                .forEach(employee -> System.out.println(employee));
    }

    private void m3getAdults(List<Employee> listado){

        Predicate<Employee> isAdult = employee -> employee.getSalaryEmployee()>5000;

        listado.stream()
                .filter(isAdult)
                .forEach(employee -> System.out.println(employee));
    }

    public static void main(String[] args) {
        //
        AppStream aps = new AppStream();

        //
        Employee e1 = new Employee(1, "John Doe", "Software Engineer", 5500.00, "IT");
        Employee e2 = new Employee(2, "Jane Smith", "Project Manager", 6500.00, "Management");
        Employee e3 = new Employee(3, "Carlos Perez", "Data Analyst", 4800.00, "Analytics");
        Employee e4 = new Employee(4, "Linda Kim", "UX Designer", 5300.00, "Design");
        Employee e5 = new Employee(5, "Raj Patel", "DevOps Engineer", 5900.00, "IT");
        Employee e6 = new Employee(6, "Sara Gomez", "HR Specialist", 4000.00, "Human Resources");
        Employee e7 = new Employee(7, "Mike Johnson", "Marketing Coordinator", 4500.00, "Marketing");
        Employee e8 = new Employee(8, "Emma White", "Financial Analyst", 5200.00, "Finance");
        Employee e9 = new Employee(9, "David Brown", "Sales Executive", 4700.00, "Sales");
        Employee e10 = new Employee(10, "Sophia Green", "Legal Advisor", 6100.00, "Legal");
        //Employee e11 = new Employee(10, "Sophia Green", "Legal motor", 6100.00, "Legal");

        List<Employee> listadoEmpleados = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);

        //busqueda filter
        aps.m1getDevs(listadoEmpleados,"Data Analyst");

        //reversa sorted
        aps.m2getinverser(listadoEmpleados);

        //listado de empleados por condicion
        aps.m3getAdults(listadoEmpleados);

    }
}
