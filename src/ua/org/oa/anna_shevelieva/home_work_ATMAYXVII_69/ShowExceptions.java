package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_69;

import java.util.ArrayList;

public class ShowExceptions {

    // 1-------------ArrayIndexOutOfBoundsException------------------

    void ArrayIndex(int z) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        try {
            System.out.println(arr[z]);
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("Show ArrayIndexOutOfBoundsException  ");

        }
    }

    // 2----------------IllegalArgumentException-------------------

    void IllegalArgument(String s) {
        try {
            System.out.println(Integer.parseInt(s));
            System.out.println();
        } catch (IllegalArgumentException iae) {
            System.out.println(
                    "Show IllegalArgumentException ");

        }
    }

    // 3----------------ClassCastException-------------------

    void ClassCastE() {
        try {
            Object d = new Double(15.8);
            System.out.println((String) d);
        } catch (ClassCastException iae) {
            System.out.println("Show ClassCastException )");

        }
    }

    // 4----------------StringIndexOutOfBoudsException-------------------

    void StringIndex(String s, int z) {
        try {
            System.out.println("Char number " + z + ": " + s.charAt(z));
            System.out.println();
        } catch (StringIndexOutOfBoundsException si) {
            System.out.println(
                    "Show StringIndexOutOfBoundsException )");
            System.out.println();
        }
    }

    // 5----------------NullPointerException-------------------

    void NullPointer1() {
        String[] s = new String[5];
        try {
            System.out.println(s[1].charAt(0));
        } catch (NullPointerException npe) {
            System.out.println("Show NullPointerException ¹1 ");

            System.out.println();
        }
    }

    void NullPointer2() {
        Integer[] in = new Integer[5];
        try {
            System.out.println(in[1].toString());
        } catch (NullPointerException npe) {
            System.out.println("Show NullPointerException ¹2 )");
            System.out.println();
        }
    }

    void NullPointer3() {
        Object ob = null;
        try {
            System.out.println(ob.toString());
        } catch (NullPointerException npe) {
            System.out.println("Show NullPointerException ¹3 ");
            System.out.println();
        }
    }

    // 6----------------StackOverflowError-------------------

    void StackOver() {
        try {
            StackOver();
        } catch (StackOverflowError so) {
            System.out.println("~");
            System.out.println("Show StackOverFlowError )");
            System.out.println();
        }

    }

    // 7----------------NumberFormatException-------------------

    void NumberFormat(String s) {
        try {
            System.out.println(Integer.parseInt(s));
            System.out.println();
        } catch (NumberFormatException iae) {
            System.out.println();
        }
    }

    // 8----------------OutOfMemoryError-------------------

    void outMem() {
        ArrayList<String> st = new ArrayList<String>();
        try {
            while (true) {
                st.add("demonstrating");
            }
        } catch (OutOfMemoryError om) {
            System.out.println(
                    "Show OutOfMemoryError ");
            System.out.println();
        }
    }


}
