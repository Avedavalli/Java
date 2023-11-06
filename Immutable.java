import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Immutable {
    private  final int value;
    private final String name;
    private final Date date;
    private final List<Integer> l;

    public Immutable(int value, String name, Date date,List<Integer> l) {
        this.value = value;
        this.name = name;
        this.date = date;
        this.l=l;
    }


    public Date getDate() {
        return (Date) date.clone();//for obj we can go for clone & for cutsom defied objects inside getter new Address(adrees.getcity)
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", date=" + date +"list "+l+
                '}';
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getL() {
        return new ArrayList<>(l);
    }

    public static void main(String[] args) {
        Immutable obj=new Immutable(123,"veda",new Date(),new ArrayList<>(Arrays.asList(1,2,3)));
        obj.getDate().setDate(24);
        obj.getL().add(4);//list.of returns immutable collections & getter metod retirns new arraylist so it wont modify
        System.out.println(obj);
    }
}
