package ua.org.oa.lecture9;

/**
 * Created by dmitr on 02.08.2017.
 */
public class Human {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;
    private static final int MIN_NAME_LENGTH = 2;
    private String name;
    private int age;

    public Human(){
    }

    public Human(String name, int age) throws HumanAgeException, HumanNameException {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws HumanNameException {
        if(name.length() > MIN_NAME_LENGTH) {
            this.name = name;
        }else{
            throw new HumanNameException("Wrong name length use more then " + MIN_NAME_LENGTH);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws HumanAgeException {
        if(age >= MIN_AGE && age <= MAX_AGE) {
            this.age = age;
        }else{
            throw new HumanAgeException("Wrong age, use age from " + MIN_AGE + " to " + MAX_AGE);
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
