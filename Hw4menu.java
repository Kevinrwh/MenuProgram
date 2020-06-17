/*
 * Kevin Ramos
 * COP3330
 * HW4
 * Purpose: Create a program that presents a menu of options to the user and performs certain functions.
 */

package menuProgram;
import java.util.Scanner;

public class Hw4menu {
	
	public static void main(String[] args) {
		
		int choice;
		boolean loop = true;
		
		// Menu while loop
		while(loop) 
		{
			// Call a method to present the menu
			printMenu();
			
			// Call a method to get the user's choice
			System.out.println("Please enter your selection");
			choice = getChoice();
			
			// If user chooses exit, do so.
			if(choice != 5) 
			{
				// Perform the action based on the user's choice.
				doTheStuff(choice);
			}
			else 
			{
				System.out.println("Exiting...");
				loop = false;
			}
		}
		
		
		System.out.println("Finished. =)");
	}
	
	// printMenu presents the menu to the user
	public static void printMenu()
	{
		System.out.println("1: Enter your name and see it echoed 20 times.");
		System.out.println("2. See what your age would be if it was doubled.");
		System.out.println("3. Determine if you are a teen.");
		System.out.println("4. Create a triangle");
		System.out.println("5. Exit the program.");
	}
	
	// getChoice stores and returns the user's choice.
	public static int getChoice()
	{
		int selection;
		Scanner input = new Scanner(System.in);
		
		// User enters their selection
		selection = input.nextInt();
		
		return selection;
	}
	
	// doTheStuff takes the user's choice and performs the action required. 
	public static void doTheStuff(int choice)
	{
		String name;
		int i = 0, j = 0;
		int age = 0;
		
		Scanner input = new Scanner(System.in);
		
		switch(choice)
		{
			// case 1 works
			case 1: // Echo the user's name 20 times
				System.out.println("Enter your name.");			
				name = input.nextLine();
				
				for(i = 0; i < 20; i++)
				{
					System.out.println(name + " ");
				}
				break;
				
			case 2: // Read the user's age. Display age and doubled age
				System.out.println("Enter your age.");
				age = input.nextInt();
				
				// If age is less than or equal to 0, prompt the user for a new age.
				while(age <= 0)
				{
					System.out.println("Invalid entry. Enter your age.");
					age = input.nextInt();
				}
				
				System.out.println("Your age: " +age + ". Doubled: " + age*2);
				break;
				
			case 3: // Display the age and doubled age of the user.
				
				// Read in user's age
				System.out.println("Enter your age.");
				age = input.nextInt();
				
				// If age is less than or equal to zero, ask for a new age.
				while(age <= 0)
				{
					System.out.println("Invalid entry. Enter your age.");
					age = input.nextInt();
				}
				
				// Output whether the user teenager.
				if(age >= 0 && age <= 18)
				{
					System.out.println("Since you are " +age + ", you are a teenager.");
				}
				else if(age > 18)
				{
					System.out.println("Since you are " +age + ", you are NOT a teenager.");
				}
				break;
			case 4: // Print a triangle with rows increasing by 1 until row length = number rows. 
				
				// Prompt the user for the size of the triangle and store it.
				System.out.println("Enter a number between 3-50.");
				System.out.println("Forming a triangle given the number of rows.");
				int numRows = input.nextInt();
				
				/*
				 * Print out the triangle. i iterates through all of the rows
				 * we determine the number of spaces as numRows - the row we are on
				 * and print an X followed by a space to form our row.
				 */
				for(i =1; i <= numRows; i++)
				{
					for(j = numRows; j >= i; j--)
					{
						System.out.print(" ");
					}
					for(int k = 1; k <= i; k++)
					{
						System.out.print("X ");
					}
					System.out.println();
				}
			default: break;
		}
		System.out.println("Returning.");
	}
}
