/** 
  * @Name   : Perihan Sahan
  * @IDE    : Eclipse
  * @version: 1.8.0_12
  * @OS     : Windows
  * @since  : 9/22/2018
  */

/* T(0) = 0, T(1) = 1, T(n) = T(n - 1) + T(1) + T(n - 1) = 2*T(n-1) + T(1) = 2*T(n) +1 
 * T(n) is 2 raised to the power of n in it, and substraction of 1 in it. 
 * T(2) = T(2 - 1) + T(1) + T(2 - 1) = 1 + 1 + 1 = 3 
 * T(3) = T(3 - 1) + T(1) + T(3 - 1) = T(2) + T(1) + T(2) = 3  + 1 + 3 = 7
 * T(4) = T(4 - 1) + T(1) + T(4 - 1) = T(3) + T(1) + T(3) = 7 + 1 + 7 = 15 
 * T(5) = T(5 - 1) + T(1) + T(5 - 1) = T(4) + T(1) + T(4) = 15 + 1 + 15 = 31 
 * T(0) and T(1) has basic values and for recursive call we need use 2*T(n)+1 formula. 
 * 
 * TripleCallCounter() method has base case and recursive call. I gave a value for int n parameter 
 * in main() method to show recursive call from 0 to 10. I added solveTripleCounter() 
 * method in for loop to receive this output. 
 * 
 * solveTripleCounter() method used for recursive call. In main() method, 
 * this method called to receive the result. class TripleCallCounter is written to 
 * have the java program and create an object in main() method. 
 */
public class TripleCallCounter {
	
	public static int solveTripleCounter(int n) {
		// n variable which is a integer numeric parameter
		// to find  recursive equation value. 
		
		if(n==1) {
			return 1; 
		} // base case 
		
		else
		 {
			 if (n==0)
			     return 0; 
			  else if(n==1)
				 return 1;   
			  else           
				 return(2* solveTripleCounter (n -1)) + 1 ; 
				
		} // recursive call   
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<11 ;i++) {
			System.out.println(solveTripleCounter(i) + " "); 
		
		}
	}

}
