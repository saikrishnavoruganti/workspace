package multiplication;

import java.util.Scanner;
public class Calculation {

	    public static void main(String args[])
	    {
	       int a, b,c, res;
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Three Numbers : ");
	       a = scan.nextInt();
	       b = scan.nextInt();
		   c = scan.nextInt();
		   
	       res = a + b + c;
	       System.out.println("Addition = " +res);
		   
	       res = a - b - c;
	       System.out.println("Subtraction = " +res);
		   
	       res = a * b * c;
	       System.out.println("Multiplication = " +res);
		   
	       res = a / b / c;
	       System.out.println("Division = " +res);
	    }
	}


