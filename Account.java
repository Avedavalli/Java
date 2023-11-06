import java.util.HashMap;
import java.util.HashSet;

public class Account {
    private String accountName;
    private String accountType;

    public Account(String accountName,String accountType) {
        this.accountName = accountName;
        this.accountType=accountType;
    }

    public static void main(String[] args) {
        HashMap hm=new HashMap<Integer,Account>();
        HashSet hs=new HashSet();
        hs.add(new Account("veda","savings"));
        hm.put(1,new Account("veda","savings"));
       // hm.put(1,)

    }
}
