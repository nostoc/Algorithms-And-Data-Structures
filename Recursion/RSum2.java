/** 
  * @Name   : Perihan Sahan
  * @IDE    : Eclipse
  * @version: 1.8.0_12
  * @OS     : Windows
  * @since  : 9/23/2018
  */

 /* 
  * This program finds the summary of numbers recursively.
  * Some integer variables used to pass values to recursiveSum() 
  * and sumOf() methods. Hard-coded values was given for the integer parameter
  * in factorial() method. 
  */

public class RSum2{
	
    
   /* It gives sum of two integer numbers and return it. */  
    public static int recursiveSum(int x, int y){
  
          
        if(x==y){
            return 0; 
        }
           
         else if (x==1) {
           return y+1; 
         } 
           
             
         else {
           return 1 + recursiveSum(x-1,y);   
         }  
 
    }
    
    /* It gives recursive formula for factorial and then 
     * return the result either for base case and recursive call. 
     * 
     * factorial(0) = 1, factorial(1) = 1
     * factorial(n) = n * factorial(n-1) --> This formula used to find recursive call. 
     * 
     */
    public static int factorial (int n) {
	    	
	    	if((n==0) || (n==1)) {
            
            return 1; // base case
	    
          }

	    	else {
	    		return n*factorial(n-1); //recursive call
	    	}			
	    	
    }
       
   /* recursive logic to find sum of 6. 
    * sumOf() method with variable of number to find the summary of num.   
    */
   public static int sumOf(int num){
   
     System.out.println("Step " + num); 
        
        if(num==1){
          System.out.println("Return value is: 1"); 
          return 1; //base case
        }
        else{
          int sum = num + sumOf(num-1); 
          System.out.print("Return value is: " + sum + " = "); 
          System.out.println(num + " + sumOf(" + num + "-1)"); 
          return sum; //recursive call 
        }       
    } 
    
    public static void main(String args[]){
  
    RSum2 demo = new RSum2(); 
  
   int x = demo.factorial(3);
   int y = demo.factorial(5);
   int z = recursiveSum(x,y);
   System.out.println("the recursive sum of two integers(3 and 5): " + z); 
   System.out.println();
   
   int a = demo.factorial(0);  int b = demo.factorial(0); 
   int c = recursiveSum(a,b);
   System.out.println("the sum of 0+0: " + c); 
   
   int a1 = demo.factorial(0);  int b1 = demo.factorial(1); 
   int c1 = recursiveSum(a1,b1);
   System.out.println("the sum of 0+1: " + c1);
   System.out.println();
   
   int a2 = demo.recursiveSum(0,0); 
   System.out.println("0 + 0 = " +a2); 
   
   System.out.println(); 
   
   System.out.println("The sum of recursion numbers: " + demo.sumOf(2));
   System.out.println();
   System.out.println("The sum of recursion numbers: " + demo.sumOf(6)); 
   
  }
   
}