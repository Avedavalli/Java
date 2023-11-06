import java.util.List;

public class Citiques {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        List<Integer> index=Ques.getIndex(arr,target);
        System.out.println(1+2+"one"+1+2+"two");
        if(index.size()==0){
            System.out.println("target not foumd");
        }
        else{
            System.out.println(index);
        }
    }
}
