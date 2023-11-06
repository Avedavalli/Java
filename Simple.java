import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Simple {
    public void m() {
        String cust_name = "Jane Smith";
        List<Order> salesOrders = new ArrayList<>();
        Order o1 = new Order("1", "John Doe", 100.0, new Date(23, 11, 11));
        Order o2 = new Order("2", "Jane Smith", 100.0, new Date(23, 12, 11));
        Order o3 = new Order("2", "Jane Smith", 100.0, new Date(23, 12, 11));
        salesOrders.add(o1);
        salesOrders.add(o2);
        salesOrders.add(o3);
        System.out.println(salesOrders.stream().filter(x -> x.custname.equalsIgnoreCase(cust_name)).map(o -> o.getAmount()).reduce((a, b) -> a + b).get());
    }
        public static void main(String[] args) {


      //  selcet cust.email,o.name,sum(o.amount) from customer cust,order o join cust.id=o.cust_id group by c.name having c.name="john";

    }


}
