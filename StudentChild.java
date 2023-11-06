import java.util.HashMap;

public class StudentChild extends StudentImmutable{
    public  String rname;
    public Address raddress;

    public StudentChild(String name, Address address) {
        super(name, address,new HashMap<>());
        this.rname=name;
        this.raddress=address;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Address getRaddress() {
        return raddress;
    }

    @Override
    public String toString() {
        return "StudentChild{" +
                "rname='" + rname + '\'' +
                ", raddress=" + raddress +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void setRaddress(Address raddress) {
        this.raddress = raddress;
    }

    public static void main(String[] args) {
        Address address1=new Address("nagpur","5431");
        StudentImmutable immobj =new StudentImmutable("veda",address1,new HashMap<>());
        StudentChild mobj=new StudentChild("anil",address1);
        address1.setCity("hyderabad");
        address1.setPincode("500090");
       System.out.println(immobj.getAddress());
        System.out.println(mobj.getAddress());
        System.out.println("-------");
        Address address2=new Address("Hyd","5431");
        address1=address2;
        System.out.println(immobj.getAddress());
        System.out.println(mobj.getAddress());

//        StudentChild obj=new StudentChild("anil",address1);
//        StudentImmutable immobj=obj;
//        System.out.println(immobj.getAddress());
//        obj.setRaddress(new Address("hyderabad","500090"));
//        System.out.println(immobj.getAddress());
    }
}
