package ua.org.oa.practice2;

public class TheTask2 {
    public static String part (String s)
    {
        String greeting;
        greeting = s.substring(((s.length()/2)-1), (s.length()/2)+2);
        return greeting;
    }
}