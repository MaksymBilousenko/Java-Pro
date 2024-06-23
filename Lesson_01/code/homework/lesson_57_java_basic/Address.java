package homework.lesson_57_java_basic;

public class Address {
    public String postcode;
    public String city;
    public String street;
    public String house;

    public Address(String postcode, String city, String street, String house) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return
                "PC = " + postcode + '\'' +
                ", C='" + city + '\'' +
                ", Str='" + street + '\'' +
                ", H='" + house + '\'' +
                '}';
    }
}
