package multiplication;

public class loops {
	public static void main(String[] args)
	{
	   printPattern();
	}

	static void printPattern(){

	int i,j,k;

	for (i = 1; i <= 7; i++)
	{
	  for (j = 1; j <= i; ++j)
	      System.out.print(j);

	  for (k = 7 - i; k >= 1; k--)
	     System.out.print("*");

	  System.out.println("");
	      } 



	  }
}
