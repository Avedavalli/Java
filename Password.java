import java.util.Random;

public class Password {
    public String getPassword(int length){
        String password="";
        for(int i=0;i<length;i++){
          password=password+ String.valueOf((char)new Random().nextInt(52));
        }
        return password;
    }
    public String getOtp(int length){
        String otp="";
        for(int i=0;i<length;i++){
            otp=otp+new Random().nextInt(10);
        }
        return otp;
    }
    public void getOtp2(){
        int random_no=(int)(Math.random()*90000)+10000;
        System.out.println(String.valueOf(random_no));
    }
    public String maskedMobileNum(String phone_no){
        String lastDigits=phone_no.substring(phone_no.length()-2);
        String sub=phone_no.substring(0,phone_no.length()-2);
        sub=sub.replaceAll("\\d","*");
        return sub+lastDigits;
    }

    public static void main(String[] args) {
        Password p=new Password();
        System.out.println(p.getOtp(5));
        System.out.println(p.getPassword(6));
        System.out.println(p.maskedMobileNum("8919899195"));
        p.getOtp2();
        System.out.println("8919899195".replaceAll(".(?=.{3})","#"));
        System.out.println("8919899195".replaceAll("\\d{8}","@"));
    }
}
