package ua.org.oa.lecture6.strings;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String name1 = "Vasya";
        String name2 = "Vasya";
        String name3 = new String("Vasya");
        String name4 = name3.intern();

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1 == name4);

        System.out.println(name1.equals(name3));
        System.out.println(name1.length());

        String s = "mama mila ramu";
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf("mila"));
        System.out.println(s.indexOf("mila"));
        System.out.println(s.indexOf('a',5));
        System.out.println(s.indexOf('y'));
        System.out.println(findSubstringIndex(s, "ma"));

        String s1 = s.substring(2,7);
        System.out.println(s1);

        System.out.println(s.replace('m', 'p'));
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());

        for (int i = 0; i < 100; i++) {
            sb.append(i).append(" ");
            System.out.println("sb.length() = " + sb.length());
            System.out.println("sb.capacity() = " + sb.capacity());
        }

        System.out.println(sb.delete(2, 3));

        StringBuilder sb1 = new StringBuilder(s);
        sb1.append(" papa");
        s = sb1.toString();
        System.out.println(s);
    }
    public static ArrayList<Integer> findSubstringIndex(String source, String toFind){
        ArrayList<Integer> indexList = new ArrayList<>();
        int index = 0;
        while ((index = source.indexOf(toFind, index)) != -1){
            indexList.add(index++);
        }
        return indexList;
    }
}
