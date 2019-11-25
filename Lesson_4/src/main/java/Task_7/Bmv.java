package Task_7;

public class Bmv extends Car {

    private int temperature;

    public Bmv(String name, int size) {
        super(name, size, "BMW", "Germany");
    }

    public void controlClimate(int temperature) {
        this.temperature = temperature;
        System.out.println("Current temperature in the car is " + temperature + " C");
    }
}
