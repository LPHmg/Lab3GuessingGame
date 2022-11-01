package Lab3;


/**
* A program that is a guessing game with 5 tries that takes the range of total guessing number pool
* 	from the user as an input and the user is then prompted to input their guess.
* The program will say if the guess is too high or too low and will prompt for another input
* 
* Group #10
* 
* @author Higinio Dylan
* @Since October 31, 2022


*/
import java.util.Scanner;
import java.util.Random;







public class Lab3{
	
	public static void main(String[] args) {
		
		System.out.println("This is a guessing game.");
		
		
		
		
		// code for setting up the range
		Scanner input = new Scanner (System.in);
		
		int lowRange;
		int highRange;
		System.out.println("Please input the lower range value: ");
		lowRange = input.nextInt();
		System.out.println("Please input the higher range value: ");
		highRange = input.nextInt();
		boolean rangeTest = false ;
		
		
		//tests if the range given is valid and if not prompts user again for input
		
		while (rangeTest == false) {
			
		
			if (lowRange >= highRange) {
				System.out.println("The lower range value is not lower than the higher value!");
			
				System.out.println("Please input the lower range value: ");
				lowRange = input.nextInt();
				System.out.println("Please input the higher range value: ");
				highRange = input.nextInt();
				}
			else {
				rangeTest = true;
				}
			
		System.out.println("the lower range is: ");
		System.out.println(lowRange);
		System.out.println("The higher range is: ");
		System.out.println(highRange);
		
		
		// code for guessing game goes here
		int diff = (highRange-lowRange);
		Random ran = new Random();
		int answer = (ran.nextInt(diff+1) + lowRange);
		
		
		
		
		
		
		System.out.print("I'm thinking of a number between " + lowRange + " and " + highRange);
		System.out.println(". You have 5 tries to guess what it is: ");
		int guess;

		guess = input.nextInt();
		int i = 0;
		System.out.println(guess);
		
		// loop for checking if the guess is correct and it has 5 tries
		while (i != 5) {
			
			if(guess == answer){
				System.out.println(guess);
				i = 5;			
					}	
				
			else if (guess != answer) {
				if (guess > answer) {
					System.out.println("Too high try again: ");
					guess = input.nextInt();
					i++;
						}
				else if(guess < answer){
					System.out.println("Too low try again: ");
					guess = input.nextInt();
					i ++;
						}
					
				else if(guess == answer){
					System.out.println(guess);
					i = 5;
					
						}	
				else {
					i ++;
					System.out.println(guess);
					}
				}
				
			}
		
	
		if (guess == answer) {
			System.out.println("You are correct the answer was " + answer +"!");
		}
		if ((i==5) && (guess != answer) ){
			System.out.println("You have run out of tries! The answer was: " + answer);
		}
		}
		
	}
	
}
