package multiplication;

public class Average {
	

		public static void main(String[] args)
	    {
	        int upperBoundNumber = 100;
	        
	        if (upperBoundNumber <= 0) {
	            System.out.println("Error: upperbound less than 0!");
	            return;
	        }
	        
	        Average aAverage = new Average();
	        aAverage.printSumNumbersUsingForLoop(upperBoundNumber);
	    }
		 private void printSumNumbersUsingForLoop(int number)
		    {
		        long sum = 0L;
		        for(int i = 1; i <= number; i++) {
		            sum += i;
		        }
		        System.out.println("Sum the "+number+" numbers.");
		        System.out.println("The sum is " + sum);
		        System.out.println("The average is "+ ((double) sum / number));
		    }

}

