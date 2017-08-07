// * @author annas
// Create a variable of type short. Initialize it with the result of the following operations:
//- the sum of two integers;
//- the sum of integer and fractional numbers;
//- the sum of values of variables of types float and int;
//- the sum of values of variables of type byte + short;
//- the sum of the values of variables of type float + double;

package ua.org.oa.anna_shevelieva.practice_1.Task3;

import java.text.Format;

public class ShortVariable
{
	   public static void main (String[] args)
	{
		// declare variables for main method
		short s;
		// sum of two integers
		s = 1+2;
		System.out.println("1 + 2 = " + s);
		// sum of integer and fractional
		s = 3+1/2;
		System.out.println("3 + 1/2 = " + s);
		// sum of float and integer
		float f = 123.4f;
		int i = 12345;
		s = (short) (f+i);
		System.out.println("123.4f + 12345 = " + s);
		// sum of byte and short
		byte b = 0b11101;
		short s1 = (short) (s + ((short)b));
		System.out.format("\n%d + %d = %d\n", b,s,s1);
		// sum of float and double
		double d = 2.1D;
		s = (short) (f+d);
		System.out.println("123.4f + 2.1D = " + s);
		}	//end main
} //end class ShortVariable

