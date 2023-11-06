import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSort {

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("veda");
        e1.setSalary(1800000);
        e1.setDepartment("software");
        Employee e2=new Employee();
        e2.setName("anil");
        e2.setSalary(1600000);
        e2.setDepartment("service");
        Employee e3=new Employee();
        e3.setName("Bhargav");
        e3.setSalary(1000000);
        e3.setDepartment("software");
        Employee e4=new Employee();
        e4.setName("pavan");
        e4.setSalary(1100000);
        e4.setDepartment("software");
        List<Employee> emplist=Arrays.asList(e1,e2,e3,e4);
        //for names sort compareto for integers -
       // emplist.stream().sorted((emp2,emp1)->emp1.getName().compareTo(emp2.getName())).collect(Collectors.toList()).forEach(System.out::println);
     //top3 highest
        List<Employee> revlist=emplist.stream().
                sorted((emp1,emp2)->emp2.getSalary()-emp1.getSalary()).collect(Collectors.toList()).stream().limit(3).toList();
       // System.out.println(revlist.toString());
        //less than 1 skip(1) 2 skip(2)
        emplist.stream().
                sorted((emp1,emp2)->emp2.getSalary()-emp1.getSalary()).
                collect(Collectors.toList()).stream().skip(1).toList().forEach(System.out::println);
        Arrays.asList(2,3,4,5,6).stream().reduce((a,b)->a+b).toString();
        System.out.println("group by");
        emplist.stream().collect(Collectors.groupingBy(emp->emp.getDepartment(),Collectors.counting())).entrySet().forEach(System.out::println);

        Map<String,Employee> map11=emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,
            Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));
    map11.entrySet().forEach(System.out::println);

        Map<String,Integer> map22= emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),e->e.get().getSalary())));
        map22.entrySet().forEach(System.out::println);

    }
}
class Employee{
    private String name;
    private int Salary;
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
