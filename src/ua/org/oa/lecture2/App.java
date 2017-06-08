package ua.org.oa.lecture2;

import java.time.LocalDateTime;

/**
 * Created by dmitr on 01.06.2017.
 */
public class App {
    static int size;
    final static int MAX_AGE;

    static {
        MAX_AGE = 100;
    }

    public static void main(String[] args) {
        int i = 25;
        long l = 25L;

        int x = 25;
        System.out.println(x);
        x = 0x25;
        System.out.println(x);
        x = 0b0_1_0_10_1_01;
        System.out.println(x);

        char myChar = 'A';
        char myChar1 = 65;
        char myChar2 = '\u0041';
        System.out.println(myChar);
        System.out.println(myChar1);
        System.out.println(myChar2);

        i = 'ї' + 1;
        System.out.println(i);

        double d = 0;
        for (int j = 0; j < 100; j++) {
            d = d + 0.1;
            System.out.println(d);
        }

        double n1 = 0.1;
        float n2 = 0.1f;
        System.out.println(n1 == n2);
        System.out.println(1.23e-3);

        boolean bool = true;

        int age;
        age = 5;
        System.out.println(age);

        int q, w = 4, e, r = 9, t;

        System.out.println("size = " + size);

        int size = 5;
        System.out.println("size = " + size);
        System.out.println("App.size = " + App.size);

        final int MIN_AGE;
        MIN_AGE = 10;

        System.out.println(MIN_AGE);

        System.out.println(9%2);
        System.out.println(125%10);

        byte b = 5;
        int myInt = b;

        long mylong = Long.MAX_VALUE - 565896654;
        System.out.println(mylong);
        float myFloat = mylong;
        System.out.println(myFloat);
        long mylong1 = (long) myFloat;
        System.out.println(mylong1);

        byte sumByte = 2 + 3;
       final byte b1 = 125;
        final byte b2 = 123;
        sumByte = (byte) (b1 + b2);
        System.out.println(sumByte);

        i = 8;
        System.out.println(i);
        System.out.println(~i+1);
        i = 256817;
        System.out.println(i = (byte)i);
        System.out.println(i);

        long value = 568;
        for (int j = 0; j < 64; j++) {
            System.out.println("#" + j + " = " + ((value & (long)Math.pow(2, j)) !=0));
        }

        long mult = 1000_000 * 1000_1000L;
        System.out.println(mult);

        double dev = 3/4f;
        System.out.println(dev);

        double myDouble = 1./0 - 1./0;

        System.out.println(myDouble);
    }
}
