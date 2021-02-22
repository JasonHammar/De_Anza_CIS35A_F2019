import java.util.Scanner;

public class squareRoot {
	private static Scanner in;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		 boolean right = true;
		 
			 
		 
		float n = in.nextFloat();
		float lastGuess = in.nextFloat();
		float nextGuess = (lastGuess + n / lastGuess) / 2;			
		
		while(right) {
			if(nextGuess == lastGuess || (nextGuess <= lastGuess + 0.0001 && nextGuess >= lastGuess - 0.0001)) {
				System.out.printf("Square root is: %2f", nextGuess);
				break;
			}else {
				//System.out.printf("Square Root is not: %2d", nextGuess);
				lastGuess = nextGuess;
				nextGuess = (lastGuess + n / lastGuess) / 2;
				
			}
		
		 }
	}

}

/*TEST CASES FOR PART 2:
 * 
 * So far, I have had difficulty testing the square root case, and figuring out where
 * to implement the square root function.
 * Tried testing what would happen if I took the parentheses away, didn't work.
 * Tied using while loop, had promising result. However, the loop went 
 * on forever, and I had to stop it. Added a greater than and less than 
 * to the if condition to see if it would help.
 * Changed greater than and less than signs to see if they would work.
 * Just put in and sign in if else statement. 
 * It will say that the square root of that number is a whole 
 * number, doesn't include decimals.
 * Tested by declaring all variables as floats, made now all outputs have decimals.
 */
