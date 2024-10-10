package Stream;

import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    //
    private void m4getOldJob(List<Employee> listado){

        listado.stream()
                .sorted(Comparator.comparing(Employee::getSalaryEmployee).reversed())
                .limit(1)
                .forEach(System.out::println);

    }

    //campos calculados

    private void m5getMaxminSalary(List<Employee> listado){
        double maximo =  listado.stream()
                .mapToDouble(e -> e.getSalaryEmployee())
                .max()
                .orElse(0);

        double minimo =  listado.stream()
                .mapToDouble(e -> e.getSalaryEmployee())
                .min()
                .orElse(0);

        //maximo mas el resto de valores
        Employee maxemp =  listado.stream()
                .max(Comparator.comparing(employee -> employee.getSalaryEmployee()))
                .orElse(new Employee());

        System.out.println(maximo);
        System.out.println(minimo);
        System.out.println(maxemp);
    }

    //Promedio de precios
    public void m6getAverage(List<Employee> listado){

        double promedio =  listado.stream()
                .mapToDouble(value -> value.getSalaryEmployee())
                .average()
                .orElse(0);

        System.out.println("Promedio es : " + promedio);
    }

    //Estadisticas totales
    public void m7getSumary(List<Employee> listado){

        //
        DoubleSummaryStatistics estadisticas =  listado.stream()
                .mapToDouble(e -> e.getSalaryEmployee())
                .summaryStatistics();

        //
        //System.out.println(estadisticas);
        System.out.println("Suma de salarios : " + estadisticas.getSum());
    }

    //Distinct
    public void m8getDistinct(List<Employee> listado){
        listado.stream()
                .distinct()
                .forEach(System.out::println);
    }

    //Contar , con filtro y solo
    public void m9getCount(List<Employee> listado){

        double cantdad1 =  listado.stream()
                .count();

        int cantidad2 =  listado.size();

        System.out.println("con filtros : " + cantdad1);
        System.out.println("sin filtros : " + cantidad2);
    }

    //sky para saltar los elementos , limit para recuperar elementos
    private void m10SkypLimit(List<Employee> listado){
        List<Employee> listadoSaltar =  listado.stream()
                                        .skip(5)
                                                .collect(Collectors.toList());
        List<Employee> listadoLimitar = listado.stream()
                        .limit(5)
                                .collect(Collectors.toList());

        listadoSaltar.forEach(e -> System.out.println(e));

        listadoLimitar.forEach(System.out::println);

        //metodo listado de paginacion
        int skyp = 2;
        int limit = 2;

        List<Employee> paginacion = listado.stream()
                .skip(skyp * limit) //0
                .limit(limit)           //2
                .collect(Collectors.toList());

        System.out.println("paginacion");
        paginacion.forEach(System.out::println);
    }

    //GETanyYouger
    private void m11getAnyYounger(List<Employee> listado){

        //prediacte
        Predicate<Employee> isYoug =  employee -> employee.getSalaryEmployee()> 5000;

        boolean valor =  listado.stream()
                .anyMatch(isYoug);

        System.out.println("hay un valor mayor a 5000 ?  : " + valor);
    }

    //map
    private void m12map (List<Employee> listado){

        listado.stream()
                .map(e -> {
                    e.setSalaryEmployee(e.getSalaryEmployee() * 0.15 + e.getSalaryEmployee());
                    return "Employee(idEmployee=" + e.getIdEmployee() +
                            ", jobEmployee=" + e.getJobEmployee() +
                            ", salaryEmployee=" + e.getSalaryEmployee() + ")";
                })
                .forEach(System.out::println);
    }

    private void m13flatMap (List<Employee> listado){
        listado.stream()
                .flatMap(e -> {
                    e.setSalaryEmployee(e.getSalaryEmployee() * 1.10);
                    //retornamos
                    return Stream.of(e.getSalaryEmployee(),e.getJobEmployee(),"REGISTROS");
                })
                .forEach(e -> System.out.println(e));
    }

    //
    private void m14GroupBy(List<Employee> listado){
          Map<String , List<Employee>> byDepartment =  listado.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartmentEmployee()));

          //
        System.out.println(byDepartment);

        // con 2 agrupaciones
        Map<String , Map<String, List<Employee>>> bydepartamentJob =  listado.stream()
                .collect(Collectors.groupingBy(Employee -> Employee.getDepartmentEmployee() , Collectors.groupingBy(Employee -> Employee.getJobEmployee())));

        System.out.println(bydepartamentJob);

        //var
        var bydepartamentJob2 =  listado.stream()
                .collect(Collectors.groupingBy(Employee -> Employee.getDepartmentEmployee() , Collectors.groupingBy(Employee -> Employee.getJobEmployee())));

        System.out.println(bydepartamentJob2);
    }

    // m15
    private void m15Order(){
        Stream<String> st =  Stream.of("z","a","v","y");

        st.sorted(Comparator.reverseOrder())
                .forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {
        //
        AppStream aps = new AppStream();

        //
        Employee e1 = new Employee(1, "John Doe", "Software Engineer", 5500.00, "IT");
        Employee e2 = new Employee(2, "Jane Smith", "Software Engineer", 6500.00, "Management");
        Employee e3 = new Employee(3, "Carlos Perez", "Data Analyst", 4800.00, "Analytics");
        Employee e4 = new Employee(4, "Linda Kim", "UX Designer", 5300.00, "Design");
        Employee e5 = new Employee(5, "Raj Patel", "DevOps Engineer", 5900.00, "IT");
        Employee e6 = new Employee(6, "Sara Gomez", "HR Specialist", 4000.00, "Human Resources");
        Employee e7 = new Employee(7, "Mike Johnson", "Marketing Coordinator", 4500.00, "Marketing");
        Employee e8 = new Employee(8, "Emma White", "Financial Analyst", 5200.00, "Finance");
        Employee e9 = new Employee(9, "David Brown", "Sales Executive", 4700.00, "Sales");
        Employee e10 = new Employee(10, "Sophia Green", "Legal Advisor", 6100.00, "Legal");
        Employee e11 = new Employee(10, "Sophia Green", "Legal Advisorr", 6100.00, "Legal");

        List<Employee> listadoEmpleados = Arrays.asList(e1,e2,e10,e11);

        //busqueda filter
        aps.m1getDevs(listadoEmpleados,"Data Analyst");

        //reversa sorted
        aps.m2getinverser(listadoEmpleados);

        //listado de empleados por condicion
        aps.m3getAdults(listadoEmpleados);

        //listar de mayor a menor  , obtener el primer valor
        System.out.println("salary top");
        aps.m4getOldJob(listadoEmpleados);


        //campos calculados
        //MAXIMO Y MINIMO EN Salarios
        aps.m5getMaxminSalary(listadoEmpleados);

        //Promedio de salarios
        aps.m6getAverage(listadoEmpleados);

        //Estadisticas de Salario
        aps.m7getSumary(listadoEmpleados);

        //Distinct , por equals has code en id
        aps.m8getDistinct(listadoEmpleados);

        //Contar elementos
        aps.m9getCount(listadoEmpleados);

        //saltar elementos
        aps.m10SkypLimit(listadoEmpleados);

        //any match
        aps.m11getAnyYounger(listadoEmpleados);

        //map
        aps.m12map(listadoEmpleados);

        //flatmap aplana listas aninadas en una sola secuencia
        aps.m13flatMap(listadoEmpleados);

        //agrupacion segun departamento
        aps.m14GroupBy(listadoEmpleados);

        //stream order
        aps.m15Order();



    }
}
