package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_69;

public class ShowExceptionsTest {
    public static void main(String[] args) {

        ShowExceptions error = new ShowExceptions();

        error.ArrayIndex(7);

        error.IllegalArgument("234i");

        error.ClassCastE();

        error.StringIndex("demonstrating", 13);

        error.NullPointer1();

        error.NullPointer2();

        error.NullPointer3();

        error.StackOver();

        error.NumberFormat("0i");

        error.outMem();

    }

}
