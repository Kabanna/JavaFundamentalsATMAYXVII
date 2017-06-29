package ua.org.oa.practice2;

/**
 * Created by dmitr on 29.06.2017.
 */
public class StringUtils {

    public static final int BEGIN_INDEX = 1;

    public static String concatStringWithoutSymbols(String s1, String s2){
        return s1.substring(BEGIN_INDEX).concat(s2.substring(BEGIN_INDEX));
    }
}
