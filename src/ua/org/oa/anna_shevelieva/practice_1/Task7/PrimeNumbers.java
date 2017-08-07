/**
 * 
 */
/**
 * @author annas
 * Task: Calculate the sum of prime numbers in the range from 1 to 20
 *
 */
package ua.org.oa.anna_shevelieva.practice_1.Task7;
import java.util.Scanner;

class PrimeNumbers {
    public static void main(String args[])
    {
        int r, sum=0;
        r = 20;
        
        for(int i=2; i<r; i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    flag=1;
            }
            if(flag==0)
            {
            	System.out.println(i+"");
                
                sum+=i;
            }
        }
        System.out.println("Sum of prime numbers in range from 1 to 20 = "+sum);
    }
}
