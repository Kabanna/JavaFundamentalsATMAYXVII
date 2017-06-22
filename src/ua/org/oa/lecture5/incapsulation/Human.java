package ua.org.oa.lecture5.incapsulation;

public class Human {
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 100;
    private String name;
    private byte age;

    public Human(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            this.age = (byte)age;
        }else{
            System.out.println("Wrong age, use age from " + MIN_AGE + " to " + MAX_AGE);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
