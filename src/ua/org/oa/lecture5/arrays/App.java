package ua.org.oa.lecture5.arrays;

import java.util.Arrays;

/**
 * Created by dmitr on 22.06.2017.
 */
public class App {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        System.out.println(Arrays.toString(intArray));
        intArray[1] = 56;
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            intArray[i]++;
        }
        System.out.println(Arrays.toString(intArray));
        for (int i : intArray) {
            i++;
        }
        System.out.println(Arrays.toString(intArray));

        int[] intArraySimple = {3, 45, 6, 7, 8, 9};
        System.out.println(Arrays.toString(intArraySimple));
        int[] intArrayHybrid;
        intArrayHybrid = new int[]{2,4,5,6,7,8,9};
        System.out.println(Arrays.toString(intArrayHybrid));

        System.out.println(Arrays.toString(args));

        System.out.println(Integer.parseInt(args[1]) + 25);

        int[][] intArrayS = {{2,6,5},{1},{},{5,5,5},null,{1,2,3,4}};

        System.out.println(Arrays.deepToString(intArrayS));

        intArrayS[3][1] = 1;
        System.out.println(Arrays.deepToString(intArrayS));
        intArrayS[4] = new int[]{2,2,2};
        System.out.println(Arrays.deepToString(intArrayS));

        for (int[] array : intArrayS) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
