import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class NandresQ2 {
    public static void main(String[] args) {
        String[] str={"Veda","sri","anil","dhsjdh","s","we",null,"","w","ss"};
        //get list where length is <3 after filtering add z at begining and a at ending
//        List<String> l=new ArrayList<>();
//        Arrays.stream(str).map(s->{
//            if(s==null){
//                l.add("z"+"a");
//            }
//            else if( s.length()<3){
//                l.add("z"+s+"a");
//            }
//            return "";
//        });
//        System.out.println(l);

      // Arrays.stream(str).filter(s->s==null).map(s->"z"+s+"a").filter(s-> !Optional.ofNullable(s).isEmpty() && s.length()<3).map(s->s="z"+s+"a").forEach(System.out::println);
       // Arrays.stream(str).filter(s->s==null ||s.length()<3).map(s->"z"+(s==null?"":s)+"a").forEach(System.out::println);
        Arrays.stream(str).filter(s->Optional.ofNullable(s).orElse("").length()<3).map(s->"z"+Optional.ofNullable(s).orElse("")+"a").forEach(System.out::println);

    }
}
