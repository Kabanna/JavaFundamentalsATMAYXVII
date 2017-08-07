package ua.org.oa.anna_shevelieva.practice_2;

import java.util.Arrays;

public class StringUtilsTest {
    public static void main(String[] args) {
        System.out.println("~~~ Test for 7th task ~~~");
        String s = "The name \"zorilla\" comes from the word \"zorro\", which in Spanish means \"fox\"";
        char[] symbols = {'a','s'};
        int result = StringUtils.countWordsAndWithSymbols(s, symbols);
        System.out.println("Words that end with " + Arrays.toString(symbols) + " in string "
                + s + " occurs" + " " + result + " times");

        System.out.println("~~~ Test for 5th task ~~~");
        String result5 = StringUtils.concatStringWithoutSymbols("HHello", "WWorld");
        System.out.println("~result = " + result5);
    }
}
