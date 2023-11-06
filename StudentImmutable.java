import java.util.HashMap;
import java.util.Iterator;

public class StudentImmutable {
    public final String name;
    public final Address address;
    public final HashMap<String,String> testmap;

    public StudentImmutable(String name, Address address,HashMap<String,String> hm) {
        this.name = name;
        this.address = address;
        //deep copy of collection in cons
        String key;
        HashMap<String,String> temp=new HashMap<>();
        Iterator<String> it=hm.keySet().iterator();
        while (it.hasNext()){
            key=it.next();
            temp.put(key,hm.get(key));
        }
        this.testmap=temp;
    }

    public HashMap<String, String> getTestmap() {
        return (HashMap<String, String>) testmap.clone();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentImmutable{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        return Address.getInstance(address);
    }

    public static void main(String[] args) {
       StudentImmutable s=new StudentImmutable("veda",new Address("hyd","500090"),new HashMap<>());
        System.out.println(s.getAddress().hashCode());
        Address address1 = s.getAddress();
        address1.setCity("Mcl");
        address1.setPincode("522426");
        System.out.println(address1.hashCode());


    }
}
