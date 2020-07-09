package changeMaker;

import java.util.Scanner;

/*
 * Write program to break change from 1-99 cents
 * Return least amount of coins
 * Note: if there are no quarters as 
 * change we should not display "0 quarter".
 * Only print the expected change. 
 *  
 *  Example
 *  
 *   change = 6 cents
	Output should be: 
	1 Nickels 
	1 Pennies
*/


public class changeMaker {

	

	
	public static void main(String[] args) {
		     
		int amount, originalAmount, quarters, dimes, nickels, pennies;		//initialize coin variables
		  
		System.out.println("Enter a number from 1 to 99.");					//prompt input
		         
		Scanner in = new Scanner(System.in);								//create a scanner object 
		amount = in.nextInt();												//amount set to input value
		  	
		originalAmount = amount;											//create a value holder for return message
		
		quarters = amount / 25;												//quarters equals int entered divided by 25
		amount %= 25;														//amount now equals int entered % 25 
																			//to set value back to remainder
		
		dimes = amount / 10;												//process repeats and reverts until pennies
		amount %= 10;
		
		nickels = amount / 5;
		amount %= 5;
		
		pennies = amount;													//pennies equal whatever left over
		  
		System.out.println(originalAmount + " cents in least amount of coins:"); //print original amount
		
		if(quarters > 0) { System.out.println(quarters + " quarters");}		//conditions to print results only if they hold value greater
		if(dimes > 0) {System.out.println(dimes + " dimes");}
		if(nickels > 0) {System.out.println(nickels + " nickels");}
		if(pennies > 0) {System.out.println(pennies + " pennies");}
		
		
		in.close();															//close scanner
		      	
	}

}
