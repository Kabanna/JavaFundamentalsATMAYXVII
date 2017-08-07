//Input: 2 cathetus and the hypotenuse of the triangle. 
//Check whether this triangle is rectangular. 
//Calculations should be written with an expression consisting of one line 
//(using the "?:" Operator).

package ua.org.oa.anna_shevelieva.practice_1.Task4;
import java.util.Scanner; 

public class RectangularTriangle 
{
 static int cathetus1;
 static int cathetus2;
 static int hypotenuse;

	public static void squareness()
	{
	 Scanner in = new Scanner(System.in);
	 System.out.print ("Enter cathetus1 ");
	 cathetus1 = in.nextInt();
	 System.out.print ("Enter cathetus2 ");
	 cathetus2 = in.nextInt();
	 System.out.print ("Enter hypotenuse ");
	 hypotenuse = in.nextInt();
	 boolean b = (cathetus1*cathetus1 + cathetus2*cathetus2 == hypotenuse*hypotenuse) ? true : false;
	 if (b==true)
	  System.out.print ("Rectangular triangle");
	 else
	  System.out.print ("Triangle is not rectangular");
	   
	}
	
	public static void main(String[] args) 
	{
		squareness();
	}
}