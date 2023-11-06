import java.util.HashMap;

public class Loginext {
    public static void getCorrectOpenCloseString(String s){

        int pair=0;
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{') {
                open++;
            }
            else if(s.charAt(i)=='}'){
                close++;
                if(open>0){
                    pair++;
                    open--;
                    close--;
                }
            }
            if(close>open) break;
        }
        if(open==close){
            System.out.println(true);
        }
        else System.out.println(false);
    }
    public static void main(String[] args) {
        getCorrectOpenCloseString("{{}{}{}}");
        getCorrectOpenCloseString("{{}}{{}{{}{}}");
        getCorrectOpenCloseString("{{}}{{}{}{}}");
        getCorrectOpenCloseString("{{}}}{");
    }
}
