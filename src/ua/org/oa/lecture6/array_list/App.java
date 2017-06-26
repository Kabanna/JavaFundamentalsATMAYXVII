package ua.org.oa.lecture6.array_list;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(10);
        stringList.add("0");
        stringList.add("1");
        stringList.add("2");
        System.out.println(stringList);
        stringList.add(1, "11");
        System.out.println(stringList);
        stringList.add(4, "55");
        System.out.println(stringList);
        stringList.set(1, "22");
        System.out.println(stringList);

        System.out.println(stringList.get(2));

        for (String s : stringList) {
            System.out.println(s);
        }
        stringList.remove(1);
        System.out.println(stringList);
        System.out.println(stringList.size());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(25);
        intList.add(11);
        intList.add(222);

        System.out.println(intList.get(2) + 25);
        System.out.println(intList.get(2).getClass().getSimpleName());

        int i = Integer.parseInt("25");
        System.out.println(Integer.toBinaryString(i));
        int y = Integer.valueOf("abc", 16);
        System.out.println(y);

        Integer a, b, c;
        a = 215;
        b = 215;
        c = Integer.valueOf(15);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
