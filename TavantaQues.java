import java.util.Arrays;
import java.util.stream.Collectors;

public class TavantaQues {
    public static void main(String[] args) {
        String s1="Hello";
        Arrays.stream(s1.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().forEach(System.out::println);
        String s11="Hello";
        String s2=new String("Hello");
        String s3=new String("Hello");
        System.out.println(s3==s2);
        System.out.println(s3.equals(s2));
    }
}
