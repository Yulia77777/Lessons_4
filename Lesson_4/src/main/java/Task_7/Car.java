package Task_7;

public class Car extends Vehicle {

    private String brand;
    private String country;

    public Car(String name, int size, String brand, String country) {
        super(name, size);
        this.brand = brand;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getCountry() {
        return country;
    }
}
