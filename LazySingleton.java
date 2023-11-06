import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazySingleton implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return Inner.ins;
    }

    private LazySingleton(){

    }


    private static class Inner{

        private static final LazySingleton ins= new LazySingleton();
    }
    public static LazySingleton getIns(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return   Inner.ins;
    }

    public static void main(String[] args) {
//        Thread t1=new Thread(new LazySingleton());
//        Thread t2=new Thread(new LazySingleton());
//        t1.start();
//        t2.start();
//        Singleton o1=Singleton.getIns();
//        Singleton o2=Singleton.getIns();
//        System.out.println(o1.hashCode()+"  -o1");
//        System.out.println("o2----"+o2.hashCode());

        ExecutorService executor=null;
        try {
            executor= Executors.newFixedThreadPool(2);
            executor.submit(()->{
                LazySingleton o1=LazySingleton.getIns();
                LazySingleton o2=LazySingleton.getIns();
                Object o3;
                try {
                   o3= o1.clone();
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+" "+o1.hashCode()+" "+o2.hashCode()+" o3 "+ o3.hashCode());
            });
        }
        catch (Exception e){}
        finally {
            if(executor!=null) {
                executor.shutdown();
            }
        }
    }
}
