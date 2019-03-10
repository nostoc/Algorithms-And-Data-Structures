/** 
  * @Name   : Perihan Sahan
  * @IDE    : Eclipse
  * @version: 1.8.0_12
  * @OS     : Windows
  * @since  : 9/29/2018
  */

/* 
 * 4 + 2 = 
 * (3 + 1) + 2 =
 * ((2 + 1) + 1) + 2 =
 * (((1 + 1) + 1) + 1) + 2 =
 * ((2) + 1) + 1) + 2 =
 * ((3) + 1) + 2 =
 * (4) + 2 = 6 
 * 
 * When we look at the recursive logic above, I see that x goes until the base case, however y does not change. 
 * I assume x = 4; y = 2; x+y = 6;  I can write the algorithm above that way too: 
 * 
 * (x-1) + 1 + y = 6;  // this formula would give us the recursive call. 1 + (x-1) + y. 
 * (x-1-1) +1 +1 + y = 6; 
 * (x-1-1-1) + 1 +1 +1 = 6; .. this goes until int x value reaches to 1. 
 * 
 * When int x = 0; as a return we will have int y. 
 * When int x = 1; as a return we will have y +1. 
 * This program finds the summary of two numbers recursively with int recursiveSum(int x, int y) method.
 * I gave the hard coded values in main() method to that is passed as the parameter to recursiveSum().
 * So I reach the result of the summary of two integer numbers recursively. 
 * 
 * RecursiveSum.java class that has void main() and int recursiveSum() methods in this java program.
 */
public class RecursiveSum {
	
	public static void main(String[] args) {
		
		System.out.println("0 + 0 = " + recursiveSum(0,0));
		System.out.println();
		System.out.println("0 + 1 = " + recursiveSum(0,1));
		System.out.println();
		System.out.println("1 + 0 = " + recursiveSum(1,0));
		System.out.println();
		System.out.println("1 + 1 = " + recursiveSum(1,1));
		System.out.println();
		System.out.println("1 + 2 = " + recursiveSum(1,2));
		System.out.println();
		System.out.println("1 + 3 = " + recursiveSum(1,3));
		System.out.println();
		System.out.println("2 + 4 = " + recursiveSum(2,4));
		System.out.println();
		System.out.println("3 + 4 = " + recursiveSum(3,4));
		System.out.println();
		System.out.println("3 + 7 = " + recursiveSum(3,7));
		System.out.println();
		System.out.println("5 + 7 = " + recursiveSum(5,7));
		
		
	}
	
	public static int recursiveSum(int x, int y) {
		// int x and int y are two integer parameters in recursiveSum() method. 
		// We will find out the sum of two integers with x and y parameters. 
		 System.out.println("x,y(" + x + "," + y + ")");
		if(x==0) { 
			 System.out.println("Return value is: " + y); 
			return y; 
		// base case
		}
		
		else if(x==1) {
			 System.out.println("Return value is: " + (y+1)); 
			return y+1; 
		}
		
		else {
			int sum = 1 + recursiveSum(x-1, y);  // recursive call
			System.out.print("Return value is: " + sum + " = "); 
			System.out.println(1 + "+ recursiveSum(" + x + "-1 , " + y + ")");
			return sum; 
			//return recursiveSum(x-1, y) + 1; // recursive call
			// int sum variable used to show recursive call in println. 
		}	
		
	}

}
