package ua.org.oa.lecture8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dmitr on 24.07.2017.
 */
public class App {
    static List<String> stringList;
    static{
        try {
            stringList = (List<String>) Class.forName(new BufferedReader(new FileReader("properties")).readLine()).newInstance();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Shirt shirt = new Shirt("Shirt", 25, 52);
        shirt.setName("Shirt");
        System.out.println(shirt);

        Clothing clothing = shirt;
        clothing.wash();

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringList.add("Hell");
        stringList.add("World");
        stringList.add("Dima");
        stringList.add("Sveta");
        System.out.println(stringList);
        System.out.println(stringList.getClass().getName());
        Loundry loundry = new Loundry();

        loundry.clean(shirt);

        Clothing[] clothings = {
                new Shirt("Red shirt", 500, 48),
                new Trousers("black trousers", 700),
                new Shirt("shirt 2", 250, 55),
                new Trousers("trousers 3", 300),
                new Shirt("shirt 1", 500, 44),
                new Trousers("trousers 1", 688)
        };

        Arrays.sort(clothings);
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(clothings, new ClothComparator());
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(clothings, (a, b)->a.getName().compareTo(b.getName()));
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        Comparator<Clothing> clothingComparator = (b, a)->a.getName().compareTo(b.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(clothings, clothingComparator);
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        stringList.forEach(System.out::println);

        for (Clothing clothing1 : clothings) {
            clothing1.wash();
        }
        A a = new B();

        a.method();

        System.out.println(a.I);
    }
}
class A implements I1{
    static void method(){
        System.out.println("A");
    }
}
class B extends A {
    static void method(){
        System.out.println("B");
    }
}

interface I1{
    int I = 5;
}

interface I2 extends I1{
    int I = 15;
}