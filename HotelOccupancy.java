package chapter5;

/*Amanda Kaufman
Chapter 5
Programming Challenge 5
HotelOccupancy Class
This class calculates the percentage of rooms in a hotel that are occupied (occupancy rate), based on user input.
*/

import java.util.Scanner;

public class HotelOccupancy {

	public static void main(String[] args) {
		
		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		int numFloors;			//Number of floors in the hotel (input by user)
		int totalRooms = 0;		//Total number of rooms in the hotel (accumulator)
		int totalOccRooms = 0;	//Total number of occupied rooms in the hotel (accumulator)
		String input;			//Ask the user to repeat the program
		char again = 'n';		//Ask the user to repeat the program
		
		System.out.print("Hotel Occupancy Calculator\n\n");
		
		do
		{
			//Reset the accumulator variables to 0.
			totalRooms = 0;
			totalOccRooms = 0;
			
			//Get the number of floors in the hotel.
			System.out.print("How many floors does the hotel have? ");
			numFloors = keyboard.nextInt();
			
			//Validate the input.
			while (numFloors < 1)
			{
				System.out.print("Invalid. Enter 1 or more: ");
				numFloors = keyboard.nextInt();
			}

			//Go through each floor and get the number of rooms and occupied rooms from the user.
			for (int index = 0; index < numFloors; index++)
			{
				//Create temporary variables for number of rooms and occupied rooms.
				int numRooms = 0;
				int numOccRooms = 0;
				
				//Get the number of rooms on the floor, and store in the corresponding temp variable.
				System.out.print("How many rooms does floor " + (index + 1) + " have? ");
				numRooms = keyboard.nextInt();
				
				//Validate the input.
				while (numRooms < 10)
				{
					System.out.print("Invalid. Enter 10 or more: ");
					numRooms = keyboard.nextInt();
				}
				
				//Get the number of occupied rooms on the floor, and store in the corresponding temp variable.
				System.out.print("How many occupied rooms does floor " + (index + 1 ) + " have? ");
				numOccRooms = keyboard.nextInt();
				
				//Validate the input.
				while (numOccRooms < 0)
				{
					System.out.print("Invalid. Enter 0 or more: ");
					numOccRooms = keyboard.nextInt();
				}
				
				//Add the temporary variables to the accumulator totals.
				totalRooms += numRooms;
				totalOccRooms += numOccRooms;
			}
			
			//Output hotel data for the user.
			System.out.print("Number of rooms: " + totalRooms + "\n");
			System.out.print("Occupied rooms: " + totalOccRooms + "\n");
			System.out.print("Vacant rooms: " + (totalRooms - totalOccRooms) + "\n");
			System.out.print("Occupancy rate: " + ((double)totalOccRooms / totalRooms) + "\n\n");
			
			//Clear out the keyboard buffer.
			keyboard.nextLine();
			
			//Ask the user if they want to run the program again.
			System.out.print("Would you like to run the program again? (y/n): ");
			input = keyboard.nextLine();
			again = input.charAt(0);
		} while (again == 'y' || again == 'Y');
		
		System.out.print("\nThanks for using the program!");
		
		//Close the keyboard Scanner object.
		keyboard.close();
	}

}