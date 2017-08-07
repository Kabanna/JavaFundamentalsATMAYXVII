// * @author annas
//Calculate the sum of integers from 1 to 20.

package ua.org.oa.anna_shevelieva.practice_1.Task5;

public class SumInteger{

public static void print_sums(){

int sum = 0; 
for (int i = 1; i <= 20; i++){
	sum += i; 
}
System.out.println("The sum is " + sum);
}
public static void main(String[] args)
{
  print_sums() ;

}
} 

//public class SumInteger {
//    public static void main(String[] args) throws Exception {
//        int i = 1;
//        while (i < 20) {
//           System.out.print(i);
//           i = i + 1;
//        }
//    }
//}