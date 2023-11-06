public class Address {
    public String city;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Address(String city, String pincode) {
        this.city = city;
        this.pincode = pincode;
    }
    public static Address getInstance(Address address){
        return new Address(address.city, address.pincode);
    }
}
