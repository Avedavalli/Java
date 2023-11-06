import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AltimetrikTrainPlatform {
    Boolean val=true;
    class Inner{
        void test(){
            if(val)
                m();
        }
    }
    AltimetrikTrainPlatform(){
        (new Inner()).test();
    }
    public void m(){}
    public static void main(String[] args) {
        Boolean val=false;
        int  arr[]={900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n=arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1;int j=0;
        int platform=1;int result=1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            }
            else if(arr[i]>dep[j]){
                platform--;
                j++;
            }
            if(platform>result)
                result=platform;
        }
        System.out.println(result);

    }
}
