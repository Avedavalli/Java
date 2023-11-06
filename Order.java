import java.util.Date;

public class Order {
    public String orderId;
    public String custname;
    public double amount;
    public Date date;

    public Order(String orderId, String custname, double amount, Date date) {
        this.orderId = orderId;
        this.custname = custname;
        this.amount = amount;
        this.date = date;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustname() {
        return custname;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}
