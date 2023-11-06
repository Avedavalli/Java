import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Nandres {
    public static void main(String[] args) {
        String input="javajava";
        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        collect.entrySet().forEach(e->{
            System.out.println(e.getKey()+" "+e.getValue());
        });
        String[] arr={"james","watson","boby"};
        Optional<String> first = Arrays.stream(arr).toList().stream().sorted((e1,e2) -> e1.length()-e2.length()).skip(1).findFirst();
        Arrays.stream(arr).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(first.get());
    }

}
