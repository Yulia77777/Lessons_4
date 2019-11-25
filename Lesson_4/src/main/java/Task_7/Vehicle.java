package Task_7;

public class Vehicle {
    private String name;
    private int size;
    private int speed;
    private int direction;
    private int gearsWidth;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.speed = 0;
        this.direction = 0;
        this.gearsWidth = 15;
    }

    public void changeGears(int gearsWidth) {
        this.gearsWidth = gearsWidth;
        System.out.println("New width oof gears is: " + gearsWidth + " sm");
    }

    public void steer(int degrees) {
        this.direction = direction + degrees;
        System.out.println("Steering in the direction: " + direction + " degrees");
    }

    public void moveAtSpeed(int speed) {
        this.speed = speed;
        System.out.println("Moving at " + speed + " km/hour");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public int getGearsWidth() {
        return gearsWidth;
    }
}
