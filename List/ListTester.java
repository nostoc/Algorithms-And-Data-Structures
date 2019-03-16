/** 
  * @Name   : Perihan Sahan
  * @Lab    : 2
  * @IDE    : Eclipse
  * @version: 1.8.0_12
  * @OS     : Windows
  * @since  : 10/23/2018
  */

/*This program uses Comparable instead of Object in interface, and
 * uses isAscendering() boolean method to determine if the user 
 * input is in ascending order or not. 
 */

import java.util.*;

public class ListTester
{
   public static void main(String[] args) {
	
    	 String ans = "y";

            do
            {
            	Scanner scan = new Scanner(System.in);
                System.out.println(); 
            	
                ComparableListArrayBased aList = new ComparableListArrayBased();

                System.out.println("Input a list of integers:");
                String input = scan.nextLine();
                String[] integerString = input.split(" ");
                
                int index = 0;
                for (String num : integerString)
                {   
                	Integer number = Integer.parseInt(num);
                	aList.add(index++, number);

                }
                
                boolean isAscending = aList.isInAscendingOrder();
                if (isAscending)
                {
                    System.out.println("Your list of integers is in ascending order.");
                }
                else
                {
                    System.out.println("Your list of integers is not in ascending order.");
                }

                System.out.println("Do you want to continue(y/n):");

                ans = scan.next();
                
            } while (ans.equalsIgnoreCase("y"));   

    }
}
