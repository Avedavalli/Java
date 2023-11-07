import java.util.ArrayList;
import java.util.List;

public class InterviewQues {
    public static  void armstrong(){
        int num=153;
        int givennum=num;
        int sum = 0;
        for(int i=0;i<String.valueOf(givennum).length();i++) {
            int r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }
        if(sum==givennum){
            System.out.println("is armstring"+sum);
        }
        else
            System.out.println("not armstrong"+sum);

    }
    public static void fibinoc(){
        //0,1,1,2,3,5
        int s1=0;
        int s2=1;
        int sum=s1+s2;
        System.out.println(s1+"\n"+s2);
        for(int i=0;i<10;i++){
            System.out.println(sum);
            s1=s2;
            s2=sum;
            sum=s1+s2;

        }
    }
    public static void main(String[] args) {
        String s="madam";
        int count=0;
        List<Character> vowels=new ArrayList<>();
        vowels=List.of('a','e','i','o','u');
        Boolean isPalindrome=true;
        for(int i=0;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                count=count+1;
            }
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println("not palindrome");
                isPalindrome=false;
                break;
            }

        }
        if(isPalindrome){
            System.out.println("palindrome");
        }
        int notvowelcount=s.length()-count;
        System.out.println("vowels count "+count+"non vowels "+notvowelcount);
        fibinoc();
        armstrong();
    }
}
