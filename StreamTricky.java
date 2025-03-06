import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTricky {
    public static void main(String[] args) {
        List<Employee> emplist= Arrays.asList(new Employee("veda",150000,"Banking"),new Employee("divya",100000,"Banking"),new Employee("Anil",170000,"Sales"),new Employee("Ramya",70000,"Sales"));
        emplist.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get))).entrySet().forEach(System.out::println);


//        Map<String,Double> map11=emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),employee -> employee.get().getSalary())));
//        map11.entrySet().forEach(System.out::println);
//
//        Map<String,Double> map111=emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),e->e.get().getSalary())));
//        map111.entrySet().forEach(System.out::println);

        //parttioningBy -partition elements into two groups
        Map<Boolean, List<Employee>> partition = emplist.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 100000));

        //avg salary dep wise
        emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);

        System.out.println(partition);

       // Print Average salary of each department.

        System.out.println("Print Average salary of each department");
        Map<String, Double> avgSalary = emplist.stream().collect(Collectors.groupingBy
                (Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> entrySet = avgSalary.entrySet();
        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //names of emp greater than avg salary in dep
        emplist.stream().filter(e->e.getSalary()> avgSalary.get(e.getDepartment())).map(e->e.getName()+"|"+e.getSalary()).forEach(System.out::println);

        //Find highest paid salary in the organisation based on dep
        emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))).entrySet().forEach(System.out::println);

        //or
        emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy((t1,t2)-> (int) (t1.getSalary()- t2.getSalary())))).entrySet().forEach(System.out::println);

        // Sort the employees salary in the organisation in descending order.
        System.out.println("Sort the employees salary in the organisation in descending order");

        emplist.stream().sorted(Comparator.<Employee>comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
        //group by depart and sort the salary
        System.out.println("group by depart and sort the salary");
        Map<String, Stream<Employee>> collect = emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(), l -> l.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()))));
        collect.entrySet().stream().forEach(e->e.getValue().forEach(System.out::println));

        System.out.println(" second highest record based on department");
        emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.toList(),l->l.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get()))).entrySet().forEach(System.out::println);
    }
    }