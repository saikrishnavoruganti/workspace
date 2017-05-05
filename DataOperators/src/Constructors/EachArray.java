package Constructors;
import java.util.*;



public class EachArray {
	
	public static void main(String args[])
	{
		int a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		a=new int[n];
		
		System.out.println("enter the values");
		for(int i=0;i<n;i++)
		{
			System.out.println("enter" +(i+1)+ "value");
			a[i] = sc.nextInt();
		}
		for ( int i=0;i<a.length;i++){
			System.out.println("the values are"+a[i]);
		}
	}

}
