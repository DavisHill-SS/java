package com.part1;
import java.util.Scanner;
import java.util.Random;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		int random = rand.nextInt(100)+1;
		int guess;
		int count = 0;
		
		while(count < 5) {
			System.out.print("Enter a number between 1 and 100: ");
			guess = userInput.nextInt();
			if(Math.abs(guess - random) <= 10) {
				System.out.println("You have guessed close enough, the number was " + random);
				break;
			}
			else {
				count += 1;
				if (count == 5) {
					System.out.println("Sorry, the number was " + random);
				}
				else{
					System.out.println("Try again");
				}
			}
		}
		userInput.close();
	}

}
