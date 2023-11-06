import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AltimetrikListWithoutSort {
    public void m1(String s){
        System.out.println("m1");
    }
    public void m1(Object o){
        System.out.println("m2");
    }
    public static void main(String[] args) {


        List<Integer> l;
        l=(List.of(-20,30,-40,10));
        int[] arr=new int[l.size()];
        for (int i=0;i<l.size();i++) {
            arr[i]=l.get(i);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        l= Arrays.stream(arr).mapToObj(i->i).toList();
        System.out.println(l);


    }
}
