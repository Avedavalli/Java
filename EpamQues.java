import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EpamQues {
    public static void main(String[] args) {
        String s="java is a programming language";
        //first non repeat char
        System.out.println(Arrays.stream(s.split("")).filter(s11 -> !s11.equals(" ")).collect(Collectors.groupingBy(s1 -> s1,LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() <= 1).findFirst().get().getKey());
    }
}
