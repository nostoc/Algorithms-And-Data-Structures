/** 
  * @Name   : Perihan Sahan
  * @IDE    : Eclipse
  * @version: 1.8.0_12
  * @OS     : Windows
  * @since  : 9/22/2018
  */

 /* 
  * The purpose of Towers class is creating an object and call solveTowers() method.
  * The purpose of solveTowers() method is creating a design to solve Towers of 
  * Hanoi game. we use number of discs, and the letter of destinations. 
  * 
  * Essential variables are int count, char source,destination and spare.Since we need to know 
  * how many discs will be in the tower, we need to count them. there are 3 poles which are source, 
  * destination and spare. We need to show how discs will be move between poles without violating the 
  * game rules. So, we need those variables in solveTowers() method. The variables of int numOfdiscs is 
  * for asking user to how many discs he wants for this move. 
  */

import java.util.*;

public class Towers {
	
	public void solveTowers(int count,char source,char destination, char spare) {
		
		if(count==1) {
			System.out.println("Move a disc from pole " + source + " to pole " + destination);
		} //base case 
		
		else {
			solveTowers(count-1,source,spare,destination); 
			System.out.println("Move a disc from pole " + source + " to pole " + spare);
			
			solveTowers(1,source,destination,spare); 
			System.out.println("Move a disc from pole " + source + " to pole " + destination);
			
			solveTowers(count-1,spare,destination,source); 
			System.out.println("Move a disc from pole " + spare + " to pole " + destination);
		} //recursive call
	} //end solveTowers
	
	public static void main(String[] args) {
		
		Towers solve_towers = new Towers();
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please enter the number of discs that is greater than 2: ");
		int numOfdiscs = scan.nextInt(); 
		scan.close();
		
		solve_towers.solveTowers(numOfdiscs, 'A', 'B', 'C');
		
	}
}
