package Task_2;

public class Boxer {
    private int age;
    private int weight;
    private int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public static void main(String[] args) {
        Boxer anotherBoxer = new Boxer(15, 25, 30);
        Boxer ourBoxer = new Boxer(18, 30, 45);
        boolean win1 = anotherBoxer.fight(ourBoxer);
        System.out.println("Our Boxes won?" + " " + win1);
        boolean win2 = ourBoxer.fight(anotherBoxer);
        System.out.println("Our Boxes won?" + " " + win2);

    }

    public boolean fight(Boxer anotherBoxer) {
        return this.strength > anotherBoxer.strength;
    }
}
