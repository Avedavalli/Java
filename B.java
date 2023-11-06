public class B extends Main{

      public  int bv=10;
        int bb=29;
public static void main(String[]args){
        Main obj=new B();
        System.out.println(obj.bv);
        Main mn=new Main();
    System.out.println();
        B b=new B();
    b.nonstatic();
        mn=b;
    System.out.println(mn.bv+" "+mn.par);
    b= (B) mn;
       // B obj2=(B)new Main();
       System.out.println(b.par+"bb "+b.bb+"bv "+b.bv);
   // Main obj=new B();
   // System.out.println(Main.display()+"return ");


        }
    public void nonstatic(){
        System.out.println(Main.display());
        System.out.println(display());
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String s1 = "ONE";
        s1="llll";
        System.out.println(s1);

        s1 = s1.concat("TWO");

        s1 = s1.concat("THREE");

        System.out.println(s1);



        String s11 = "ONE";

        s11.concat("TWO");

        s11.concat("THREE");

        System.out.println(s11);


        System.out.println("ONE"+2+3+4+"FIVE");



        System.out.println(7+3+"Java"+3+7);
    }
        public static  String display(){

 B b=new B();
//            System.out.println(B.display());
            System.out.println(b.bv);
            //System.out.println(display());
            return "child";

        }

        }
