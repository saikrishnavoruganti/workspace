package multiplication;

import java.util.Scanner;

public class CheckOddEven {   
	   public static void main(String[] args) {  
		   int n;
		   System.out.println("The number is " );
		   Scanner in = new Scanner(System.in);
		   
		   n = in.nextInt();
	      
	      if ( n % 2 == 0 ) {
	         System.out.println( "even" );
	      } else {
	         System.out.println( "odd" );
	      }
	      System.out.println( "Bye " );
	   }
	}
