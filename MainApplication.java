package main_package;

import java.util.Random;
import java.util.Scanner;

public class MainApplication 
{
	// Initiating scanner to take inputs
	Scanner inp = new Scanner(System.in);	// Called the scanner class
		
	public static void main(String[] args) 
	{
		MainApplication Menu = new MainApplication();
		Menu.MainMenu();
	}
	public void Casino()
	{
		Random randomInt = new Random();		// Called the Random class
		
		// declaring variables for the game
		int Player_choice;
		int min = 1;
		int max = 100;
		int Comp_choice;
		String play_again;
		
		System.out.println("\nGuess a number between 1 to 100");
		System.out.print("Choose number: ");
		Player_choice = inp.nextInt();
		System.out.println("Computer will guess a number now");
		Comp_choice = min + randomInt.nextInt(max);
		
		if(Player_choice > 100)
		{
			System.out.println("You can't choose any number after 100");
			System.exit(-1);
		}
		else
		{
			System.out.println("Your Number: " + Player_choice);
			System.out.println("Computer's Number " + Comp_choice);
			
			if(Player_choice == Comp_choice)
			{
				System.out.println("Congratulations!!\nYou have guessed the same number than computer's number!!");
				System.out.println("Do you want to play again? Reply with Yes or No: ");
				play_again = inp.next();
				
				if(play_again.equals("Yes"))
				{
					Casino();
				}
				else
					System.exit(-1);
			}
			else
				System.out.println("Your Number is not same as the Computer's number so, the computer won!!\nBetter luck next time!");
		}
	}
	public void MainMenu()
	{
		String Play;
		System.out.print("Welcome to the Casino Gambling Game\nThis game will be exciting as you have to guess the exact same number as the computer, If your number matched then you will win");
		System.out.print("\nDo you want to play the game? Reply with Yes or No: ");
		Play = inp.next();
		
		if(Play.equals("Yes"))
		{
			System.out.println("Let's start the game. Please answer the following question to proceed further");
			PlayerPortal();
		}
		else if(Play.equals("No"))
		{
			System.out.println("You have chosen No, The game will be closed.");
			System.exit(-1);
		}
		else
		{
			System.out.print("Invalid Choice");
			System.exit(-1);
		}
		
	}
	public void PlayerPortal()
	{
		// declaring some variables
		String Username;
		String choice;
		//Taking user's input and then generating computer's number then displaying the result.
		System.out.print("Please enter your name: ");
		Username = inp.nextLine();
		System.out.print("Hello " + Username + ", You are invited to play a game, Reply with 'Yes' to start and 'No' to Exit.\nYour Choice: ");
		choice = inp.next();
		if(choice.equals("Yes"))
		{
			Casino();
		}
		else if(choice.equals("No"))
		{
			System.out.println("Your choice was No so this game will be end here, you can start it again!");
		}
		else
		{
			System.out.println("Wrong Choice!");
		}
	}
}
