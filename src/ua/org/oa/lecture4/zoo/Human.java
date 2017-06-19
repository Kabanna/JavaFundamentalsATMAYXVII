package ua.org.oa.lecture4.zoo;

public class Human {
    public static String type = "Homo sapiens";
    public String name;
    public int age;

    public Human() {
    }

    public Human(String name) {
        this(name, 1);
        sayHello(2);
    }

    public Human(String name, int newAge) {
        this.name = name;
        age = newAge;
        born();
    }

    public void sayHello(int i){
        for (int j = 0; j < i; j++) {
            born();
        }
    }

    public void born(){
        System.out.println("Hello my name is " + name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
