

/** 
  * @Name   : Perihan
  * @IDE    : Eclipse
  * @version: 1.8.0_12
  * @OS     : Windows
  * @since  : 12/5/2018
  */

/* This program uses backtracking algorithm
 *  for the eight queens problem. 
 * 
 * With two dimensional array, we create a chess board
 *  that has 8 rows&columns and place the Queens on the 
 *  board with the none of the Queens can take another 
 *  Queen off of the chess board strategy. 
 * 
 * clearBoard() method clears the chess board and 
 *  sets the all squares to empty. 
 *   
 * displayBoard() method shows chess board output
 *  with placing the Queens in it. 
 */

public class QueensTester {
	
	 public static void main (String [] args)
	 {
	      Queens q = new Queens();
	      System.out.println("The Queens on the chess board 8x8 : "); 
	      System.out.println(); 
	      q.placeQueens(1);
	      q.displayBoard();
	 }

}
