package ua.org.oa.lecture4;

import ua.org.oa.lecture4.zoo.Human;
import static java.lang.Math.*;

public class App {
    public static void main(String[] args) {
        Human human = new Human("Vasya", 25);
        human.born();
        System.out.println(human);
        Human human1 = new Human("Kolay", 30);
        System.out.println(human1);

        human = human1;
        human.name = "Sveta";
        System.out.println(human1);

        human.sayHello(3);
        System.out.println(Human.type);
        System.out.println(human.type);
        new Human("Misha", 25).type = "Gad";
        System.out.println(Human.type);
        System.out.println(sum(2, 7));

        System.out.println(PI);

        method(0);

        System.out.println(fibonachy(40));
        System.out.println(counter);

    }
    public static int counter = 0;

    public static int fibonachy(int numner){
        counter++;
        if(numner == 0){
            return 0;
        }
        if(numner == 1){
            return 1;
        }
        return fibonachy(numner - 1) + fibonachy(numner - 2);
    }

    public static void method(int i){
        System.out.println(i);
        if(i <= 5) {
            method(i + 1);
        }
        System.out.println(i);
    }

    public static int sum(short s1, short s2){
        System.out.println("sum(short s1, short s2)");
        return s1 + s2;
    }
    public static double sum(int... s1){
        System.out.println("sum(int... s1)");
        int sum = 0;
        for (int i : s1) {
            sum += i;
        }
        return sum;
    }

    public static double sum(double s1, double s2){
        System.out.println("sum(double s1, double s2)");
        return s1 + s2;
    }
    public static long sum(long s1, long s2){
        System.out.println("sum(long s1, long s2)");
        return s1 + s2;
    }

}
