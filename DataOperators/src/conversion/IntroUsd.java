package conversion;



import java.util.*;


public class IntroUsd {
	
	
	public static void main(String m[])
	{
	double inr,usd,pound;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter INR to convert into USD and pound:");
	inr=in.nextInt();
	usd=inr/60;
	pound=inr/80;
	System.out.println("INR="+inr+" is USD="+usd);
	System.out.println("INR="+inr+" is pound="+pound);
	
	}
	} 


