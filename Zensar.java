import java.util.*;
import java.util.stream.Collectors;

public class Zensar {
    public static void main(String[] args) {
        Employeee e1=new Employeee(1,"abc",20000,"hr");
        Employeee e2=new Employeee(2,"veda",2000000,"Sales");
        Employeee e3=new Employeee(3,"anil",200800,"hr");
        Employeee e4=new Employeee(4,"anu",200500,"sales");
        List<Employeee> employeeeList=new ArrayList<>();
        employeeeList=List.of(e1,e2,e3,e4);
        /*employeeeList.stream().collect(Collectors.groupingBy(Employeee::getDeptname)).entrySet().stream().sorted((o1,o2)-> (int) (o1.getSalary()-o2.getSalary()))

       for(Map.Entry<String, List<Employeee>>hm:hmap.entrySet()){
           hm.getValue().stream().sorted((o1,o2)-> (int) (o2.getSalary()-o1.getSalary()));
       }

       System.out.println(hmap);*/


    }
}
