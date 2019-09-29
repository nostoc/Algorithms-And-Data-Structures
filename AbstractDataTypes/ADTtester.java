 /** 
  * @Name   : Perihan Sahan
  * @Lab    : 3
  * @IDE    : jGRASP
  * @version: 1.8.0_12
  * @OS     : Windows
  * @since  : 12/1/2018
  */

/* This program uses Stack ADT and List ADT, 
 * uses stack to take input values, place them
 * on stack and take them off the stack. 
 *
 * reverse() method prints output showing the
 * items in the reserse order in which they were
 * inputted. 
 */
  
 import java.util.*; 

 public class ADTtester {

   public static void main(String[] args){

      String answer = "y"; 

      do { 
      
      Scanner scan = new Scanner(System.in); 
      System.out.println(); 
      
      StackListBased stackList = new StackListBased(); 
      
      System.out.print("Input a list of items: "); 
      String input = scan.nextLine(); 
     
      String[] userInput = input.split(" ");

      for(String s: userInput)
      {
         stackList.push(s); 
      }   
       
        System.out.print("\nThe reverse order you inputted your items is: "); 
         
        while(stackList.isEmpty() == false)
        {
            // System.out.print(stackList.pop() + " "); 
            System.out.print(stackList.reverse() + " ");
        }   
        
        System.out.println();

        System.out.print("\nDo you want to continue(y/n): ");
        answer = scan.next();


       } while(answer.equalsIgnoreCase("y")); 

   } 

}
