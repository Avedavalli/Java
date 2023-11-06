import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ques {
    public static void main(String[] args) {
        getCount();
    }
    public static void getCount(){
        String s="{}{}()[]";
        System.out.println(Arrays.stream(s.split("")).filter(s1->s1.equals("{")).count());
        System.out.println(Arrays.stream(s.split("")).filter(s1->s1.equals("}")).count());
       int[] arr= {1, 0,2,0,3,0,4,0, 0};
       List<Integer> arrl=new ArrayList<>();
        ArrayList<Integer> numList= (ArrayList<Integer>) Arrays.stream(arr).filter(x->x!=0);
      ArrayList<Integer> zeroList= (ArrayList<Integer>) Arrays.stream(arr).filter(x->x==0);
      arrl.addAll(zeroList);
      arrl.addAll(numList);
    }
    public static List<Integer> getIndex(int[] arr, int target) {
        List<Integer> index=new ArrayList<>();
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (target == arr[i] + arr[j]) {
                        index.add(i);
                        index.add(j);

                    }
                }
            }
            return index;
        } catch (Exception e) {
            System.out.println("target not found " + e);
        }
        return index;
    }
}
