import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WiproQues {
    public static void main(String[] args) {
        int[] arr={13,15,18,26,38,52};
        Arrays.stream(arr).filter(x -> String.valueOf(x).contains("1")).forEach(System.out::println);
       Sum s= (a, b)-> a+b;
       String s1="ll";
        System.out.println(s1.hashCode());
     s1=s1+"mm";
      //  System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s.summethod(1,2));
    }


}
