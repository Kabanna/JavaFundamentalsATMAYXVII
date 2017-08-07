package ua.org.oa.anna_shevelieva.practice_2;

public class StringUtils {

    public static final int BEGIN_INDEX = 1;

    public static int countWordsAndWithSymbols (String s, char[] symbols) {
        int counter = 0;
        s = s.toLowerCase();
        String[] symbolsString = new String[symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            symbolsString[i] = String.valueOf(symbols[i]).toLowerCase();
        }
            String[] strings = s.split("[ !?,\\.:;\"]+");
            for (String string : strings) {
                for (char symbol : symbols) { // for (String symbol : symbolsString)
                    if (string.endsWith(String.valueOf(symbol).toLowerCase())) { // if(string.endsWith(symbol))
                        counter++;
                        break;
                    }
                }
            }
            return counter;
        }
//        public static final int BEGIN_INDEX = 1;
    public static String concatStringWithoutSymbols(String s1, String s2) {
        return s1.substring(BEGIN_INDEX).concat(s2.substring(BEGIN_INDEX));
    }
    }
