import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CapgeminiQues {
    public static void main(String[] args) {
        String test = "This sentence contains two words, one and two";

        Map<String, Long> hm = Arrays.stream(test.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        Arrays.stream(test.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().filter(m->m.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
        for(String s:hm.keySet()){
            if (hm.get(s)>1){
                System.out.println(s);
            }
        }
    }
    //select salary from employe order by salary desc limit 2 offset 1
}
