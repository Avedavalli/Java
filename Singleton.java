import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return ins;
    }

    private static Singleton ins;

    private Singleton() {
    }

    public static Singleton getIns() {
        if(ins==null) {

         synchronized (Singleton.class) {
               if(ins==null) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ins = new Singleton();
                }
           }
        }

        return ins;
    }

    public static void main(String[] args) {
//        Thread t1=new Thread(new Singleton());
//        Thread t2=new Thread(new Singleton());
//        t1.start();
//        t2.start();
        ExecutorService executorService=null;
        try {
            executorService= Executors.newFixedThreadPool(5);
            Runnable task=()->{Singleton o1=Singleton.getIns();
                Singleton o2=Singleton.getIns();
                Singleton o3=Singleton.getIns();
                Singleton o4;
                try {
                    o4 = (Singleton) o3.clone();
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+" o4  "+o4.hashCode()+" o2 "+o2.hashCode()+" "+o3.hashCode());};
            executorService.execute(task);
            executorService.execute(task);
            executorService.execute(task);
        }catch (Exception e){}
        finally {
            if(executorService!=null){
                executorService.shutdown();
            }
        }




    }

//    @Override
//    public void run() {
//        Singleton o1=Singleton.getIns();
//        Singleton o2=Singleton.getIns();
//        System.out.println(Thread.currentThread().getName()+" "+o1.hashCode()+" "+o2.hashCode());
////
////        System.out.println(o1.hashCode()+"  -o1");
////        System.out.println("o2----"+o2.hashCode());
//    }
}
