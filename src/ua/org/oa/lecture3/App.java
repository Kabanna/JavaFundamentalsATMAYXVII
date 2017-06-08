package ua.org.oa.lecture3;

import java.time.Year;

public class App {
    public static final int WORK_DAY_NORMA = 22;
    private static final int TUESDAY_NUMBER = 2;
    public static String name;

    public static void main(String[] args) {
        int a = 5;
        double d = a;

        System.out.println((2 > 3) && (3 < 1));
        System.out.println(method1(false) & method2(true));

        if (name != null && name.length() > 2) {
            System.out.println("Name: " + name);
        } else {
            System.out.println("Wrong name length");
        }

        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));
        System.out.println("!false = " + (!false));

        int x = 5689;
        int y = 7459;
        System.out.println("x -> " + Integer.toBinaryString(x));
        System.out.println("y -> " + Integer.toBinaryString(y));
        System.out.println("x&y->" + Integer.toBinaryString(x & y));
        System.out.println("x|y->" + Integer.toBinaryString(x | y));

        System.out.println((x & 0b1000) != 0);
        System.out.println((x & (int)Math.pow(2, 3)) != 0);
        System.out.println((x & 0b11000)>>3);
        System.out.println("x>>2->" + Integer.toBinaryString(x >>2));
        System.out.println("x<<2->" + Integer.toBinaryString(x <<2));

        int z = -8;
        System.out.println(z << 3);
        System.out.println("z -> " + Integer.toBinaryString(z));
        System.out.println("z>>>4->" + Integer.toBinaryString(z>>>4));
        System.out.println("z>>>4->" + (z>>>4));

        int salary;
        int workDay = 25;

        if(workDay > WORK_DAY_NORMA){
            salary = 5000;
        }else{
            salary = 2000;
        }
        System.out.println(salary);

        int dayNumber = 2;

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case TUESDAY_NUMBER:
                System.out.println("Tuesday");
                break;
        }


        System.out.println((Year.isLeap(2016))?"is leap":"is not leap");
        int i = 0;
        for (; i < 10; ) {
            ++i;
            System.out.println(++i);
        }
        System.out.println(i);

        byte b = 0;
//        for(;;){
//            System.out.println(b++);
//        }

        m: for (i = 0;  i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 2){
                    continue m;
                }
                System.out.print("m" + i + j + " ");
            }
            System.out.println();
        }

    }

    private static boolean method1(boolean b) {
        System.out.println("method1(" + b + ")");
        return b;
    }

    private static boolean method2(boolean b) {
        System.out.println("method2(" + b + ")");
        return b;
    }
}
