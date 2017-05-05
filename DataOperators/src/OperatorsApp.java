import java.lang.*; 
class OperatorsApp 
{
public static int count()
{
	int k=234;
	return k++;// return the value and then incremented
	//System.out.println("aoo");
}
public boolean isValidMobileNumber(int mobileNumber)
{	// sts
	// generate a random numner, we sent that random number to given cell nu
	return false;
}
public boolean isValidEmail()
{
return false;	
}
public static void main(String[] args) {
		int i=9,j=10;
		
		i=j++; 
		
		System.out.println(i); 
		System.out.println(j); 	
	
	
	i++; // i=i+1;
	System.out.println(i);
	j++; 
	System.out.println(j);
	
		i=++j; 
		
		System.out.println(i+"----"+j);
	// i=13, j=13
		System.out.println(j++);
		System.out.println(j);
		System.out.println(++j);
	
		
		int v=count();
		System.out.println(count());
		//System.out.println(k);
		System.out.println(v);
		int a=10,b=4,c=2,d=1,f=2,e=10;
		
		int x = (a+b)/c-e/(f+d);
	
	//int x = a+b/c-e/f+d;
		
		System.out.println(x);	

			System.out.println(a<b);
			System.out.println(e>f);
			
			System.out.println(a>b && c>d);
			
		System.out.println((float)10/3);
		
System.out.println(5&4);

/*int z=(int)((Math.random())*10000);
System.out.println(z);*/
// system.in

	}
}