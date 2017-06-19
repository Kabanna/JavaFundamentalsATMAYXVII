package ua.org.oa.practice1;

public class SimpleDataTypeLoopsUtils {
    public static byte myByte;
    public static short myShort;
    public static int myInt;
    public static long myLong;
    public static boolean myBoolean;
    public static float myFloat;
    public static double myDouble;
    public static char myChar;

    public static void printDefaultValues(){
        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myChar = " + myChar);

        byte myByteLocal = 1;
        short myShortLocal = 1;
        int myIntLocal = 1;
        long myLongLocal = 1;
        boolean myBooleanLocal = true;
        float myFloatLocal = 1;
        double myDoubleLocal = 1;
        char myCharLocal = 1;

        System.out.println(" Local variables: ");

        System.out.println("myByteLocal = " + myByteLocal);
        System.out.println("myShortLocal = " + myShortLocal);
        System.out.println("myIntLocal = " + myIntLocal);
        System.out.println("myLongLocal = " + myLongLocal);
        System.out.println("myBooleanLocal = " + myBooleanLocal);
        System.out.println("myFloatLocal = " + myFloatLocal);
        System.out.println("myDoubleLocal = " + myDoubleLocal);
        System.out.println("myCharLocal = " + myCharLocal);
    }

}
