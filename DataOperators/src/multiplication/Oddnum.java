package multiplication;

public class Oddnum {
	 public static void main(String[] args)
	    {
	        int upperBoundNumber = 100;
	        
	        if (upperBoundNumber <= 0) {
	            System.out.println("Error: upperbound less than 0!");
	            return;
	        }
	        
	        Oddnum aOddnum = new Oddnum();
	        aOddnum.printSumOddNumbers(1, 100);
	        aOddnum.printSumNumbersDivisibleBySeven(1, 100);
	        aOddnum.printSumSquares(1, 100);

}
	 private void printSumOddNumbers(int lowerNumber, int upperNumber)
	    {
	        long count = 0L;
	        long sum   = 0L;
	        for (int i = lowerNumber; i <= upperNumber; i++) {
	            if (i % 2 != 0) {
	                continue;
	            }
	            sum += i;
	            count++;
	        }
	        System.out.println("5. Sum only the odd numbers from "+lowerNumber+" to "+upperNumber+", and compute the average.");
	        System.out.println("The sum is " + sum);
	        System.out.printf ("The average is %.2f", ((double) sum / count));
	        System.out.println();
	    }
	 private void printSumNumbersDivisibleBySeven(int lowerNumber, int upperNumber)
	    {
	        long   count = 0L;
	        long   sum   = 0L;

	        for (int i = lowerNumber; i <= upperNumber; i++) {
	            if (i % 7 != 0) {
	                continue;
	            }
	            sum += i;
	            count++;
	        }
	        
	        System.out.println("6. Sum numbers from "+lowerNumber+" to "+upperNumber+" that is divisible by 7, and compute the average.");
	        System.out.println("The sum is " + sum);
	        System.out.printf ("The average is %.2f", ((double) sum / count));
	        System.out.println();
	    }
	 private void printSumSquares(int lowerNumber, int upperNumber)
	    {
	        long   count = 0L;
	        long   sum   = 0L;

	        for (int i = lowerNumber; i <= upperNumber; i++) {
	            sum += i*i;
	            System.out.println(i*i);
	            count++;
	        }
	        System.out.println("7. Sum of the squares from "+lowerNumber+" to "+upperNumber+".");
	        System.out.println("The sum is " + sum);
	        System.out.printf ("The average is %.2f", ((double) sum / count));
	        System.out.println();
	    }
}
