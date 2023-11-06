package RrsiArrSum;

import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

public class ArrSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3, 0};
      // <List<Integer>> lst = new ArrayList<>();
        // lst.add(Arrays.asList(2,3));
        HashMap<Integer, List<List<Integer>>> hm = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int sum = arr[i] + arr[j];
                    if (!hm.containsKey(sum)) {
                        List<Integer> list = new ArrayList<>(Arrays.asList(arr[i], arr[j]));
                        hm.put(sum,new ArrayList<>(Arrays.asList(list)));

                    } else {
                        try {
                            List<List<Integer>> lists = hm.get(sum);
                            List<Integer> list = new ArrayList<>(Arrays.asList(arr[i], arr[j]));
                            lists.add(list);
                            hm.put(sum, lists);
                        }
                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                    }
                }
            }

                hm.entrySet().stream().map(Map.Entry::getValue).filter(x->x.size()>1).forEach(System.out::println);
       // System.out.println();
        }

}
