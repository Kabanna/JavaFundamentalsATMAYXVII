package ua.org.oa.lecture4.practice1;

/**
 * Created by dmitr on 19.06.2017.
 */
public class NumbersUtils {
    public static int simpleNumbersSum(int start, int end){
        int sum = 0;
        if(start < 2) start = 2;
        m: for (int i = start; i <= end; i++) {
            for (int j = 2; j <= i/2; j++) {
               if(i%j == 0){
                   continue m;
               }
            }
            sum += i;
            System.out.println("i = " + i);
        }
        return sum;
    }
}
