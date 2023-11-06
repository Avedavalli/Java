import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
   int bv=100;
    int par=89;
    public static String display(){
       return "parent";
    }
    public void nonstatic(){

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String para="restrict our object(List<Product>) from third party changes restrict our object";
        List<String> parawords= Arrays.asList(para);
        List<String> dupwords=parawords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(
                x-> x.getValue() > 1).map(x->x.getKey()).collect(Collectors.toList());
        System.out.println(dupwords);
    }
}

