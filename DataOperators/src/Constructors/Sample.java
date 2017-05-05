package Constructors;

import java.util.Scanner;

public class Sample {
	
	public static void getempdetails(int empid){
		System.out.println("empid");
		
	}
   public static void main(String args[]){
	   System.out.println("enter the digit");
	   Scanner sc = new Scanner(System.in);
	   int i = sc.nextInt();
	   
	    
	
	   
	   if(  i < 5){
		  
	   System.out.println("K");
	   System.out.println(i);
	   i++;
	   }
	   else
		   System.out.println("j");
	   getempdetails(89);
	   
	   
	   switch(i)
	   {
	   case 0: System.out.println("hi"); break;
	   case 4: System.out.println("hello"); break;
	   case 5: System.out.println("bye"); 
	   default : System.out.println("thank you");
	   
	   }
	   
	   
   }
}
