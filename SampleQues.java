import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleQues {
    public static void main(String[] args) {
        String s = "using streams get the count each character  ";
        s=s.replaceAll(" ","");
        Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
    }


}
