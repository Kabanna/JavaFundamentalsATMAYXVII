package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_21;

/**
 * Create a java program that satisfies the following requirements:
 1. Each class, field, method should have a name that reflects its essence and comments describing their purpose.
 2. At the stage of programming, agreements from the java code convention should be used.
 3. To set the input text, you can use a variable of type String containing at least 5 lines of text (> 400 characters), broken down into at least 3 sentences. Alternatively (preferably, but if desired) - read the text from the file on the hard disk.
 4. Important! Tasks can be solved in several ways. Suggest a minimum of 2 ways to solve the problem.
 5. To test the proposed solution, to demonstrate the correctness of the solution of the problem in each way.
 6. The package name in which the class / class is created must be in the format ua.org.oa. <Jira Login>.
 7. Individual folder in the SVN repository to save the completed tasks is located at http://oracle-academy.org.ua/svn/<Project Name> / <Jira login>
 Find what letters, vowels or consonants, more in each sentence of the given text. Indicate how many letters are greater than others.
 *
 */

import java.io.Console;

public class VovelsAndConsonants {
    public static final char[] CONSONANTS =
            {
                    'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'
            };

    public static final char SPACE = ' ';

    public static char[] getConsonants() {
        return CONSONANTS;
    }

    public static boolean isConsonant(char c) {
        boolean isConsonant = false;
        for (int i = 0; i < getConsonants().length; i++) {
            if (getConsonants()[i] == c) {
                isConsonant = true;
                break;
            }
        }
        return isConsonant;
    }

    public static boolean isSpace(char c) {
        return SPACE == c;
    }

    public static void main(String[] args) {
        int spaces = 0;
        int consonants = 0;
        int vowelcount = 0;
        Console console = null;

        try {
            String text = "The European languages are members of the same family. Their separate existence is a myth. For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ in their grammar, their pronunciation and their most common words. Everyone realizes why a new common language would be desirable: one could refuse to pay expensive translators. To achieve this, it would be necessary to.\n" +
                "\n";

            for (int index = 0; index < text.length(); index++) {
                char letter = text.charAt(index);
                if (!isSpace(letter)) {
                    if (isConsonant(letter)) {
                        consonants++;
                    } else {
                        vowelcount++;
                    }
                } else {
                    spaces++;
                }
            }

            System.out.println("Vowels:" + vowelcount + "\nConsonants :" + consonants + "\nSpaces : " + spaces);
        }
        catch(Exception ex){
        //     if any error occurs
        ex.printStackTrace();
        }
    }
}
