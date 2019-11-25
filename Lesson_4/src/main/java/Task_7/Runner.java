package Task_7;

public class Runner {
    public static void main(String[] args) {
        Bmv myCar = new Bmv("X6", 4);
        myCar.changeGears(18);
        myCar.steer(30);
        myCar.moveAtSpeed(55);
        myCar.controlClimate(21);
        myCar.steer(-90);
        myCar.moveAtSpeed(0);  //stop
    }
}
