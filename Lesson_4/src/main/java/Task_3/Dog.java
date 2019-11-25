package Task_3;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("You did not fill in the 'Name' field");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero and cannot be empty");
        }
        this.age = age;
    }
}
