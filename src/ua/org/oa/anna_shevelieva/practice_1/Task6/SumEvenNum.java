//* @author annas
//Calculate the sum of even integers from 1 to 20.
// http://www.cprogrammingcode.com/2011/09/java-program-to-find-sum-of-all-even.html

package ua.org.oa.anna_shevelieva.practice_1.Task6;

public class SumEvenNum {

public static void main (String[] arg)
{

    int sum = 0;
    for(int i = 1; i <= 20; i++)
    {
        if(i%2 == 0)
        {
            System.out.println("Even numbers : " + i);
            sum = sum + i;

    }
    }
        System.out.println("The sum of all even numbers between 1 to 20 is : " + sum);     
}   
}

