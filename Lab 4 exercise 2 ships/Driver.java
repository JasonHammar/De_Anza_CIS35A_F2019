package excercise2ships;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner inp = new Scanner(System.in);
			System.out.printf("Please enter 0 to get the properties for the first ship. \n"
					+ "please enter 1 to get the properties for the titanic cruise ship. \n"
					+ "Please enter 2 to get the properties for the docker 1 cargo ship. \n"
					+ "Please enter 3 to get the properties for all three ships. \n");
			int shipNumber = inp.nextInt();
			if (shipNumber < 0 || shipNumber > 3) {
				boolean error = true;
				while (error) {
					System.out.printf("Invalid entry, Please enter 0 to get the properties for the first ship. \n"
							+ "Please enter 1 to get the properties for the titanic cruise ship. \n"
							+ "Please enter 2 to get the properties for the docker 1 cargo ship. \n"
							+ "Please enter 3 to get the properties for all three ships. \n");
					shipNumber = inp.nextInt();
					if (shipNumber >= 0 && shipNumber <= 2) {
						error = false;
					}
				}
			}
			Ship ship[] = new Ship[5];
			CargoShip docker1 = new CargoShip();
			CruiseShip titanic = new CruiseShip();
			ship[0] = new Ship();
			ship[1] = titanic;
			ship[2] = docker1;
			// creates array of ships objects.
			ship[0].setName("plain ole' ship");
			ship[1].setName("Titanic Cruise ship");
			ship[2].setName("Tax Evasion Cargo ship");
			// sets the names of the ships
			if (shipNumber == 3) {
				System.out.printf("Properties for %s\n", ship[0].getName());
				ship[0].print();
				System.out.printf("Properties for %s\n", ship[1].getName());
				ship[1].print();
				System.out.printf("Properties for %s\n", ship[2].getName());
				ship[2].print();
				// Prints out all of the properties.
			} else {
				System.out.printf("Properties for %s\n", ship[shipNumber].getName());
				ship[shipNumber].print();
				// Prints out the selected ships properties.
			}

			System.out.printf("If you would like to quit, please press 1, otherwise, press 2 to continue. \n");
			int keepGoing = inp.nextInt();
			if (keepGoing > 2 || keepGoing < 1) {
				boolean error = true;
				while (error == true) {
					System.out.printf("Invalid entry, please type in the correct number. \n"
							+ "If you would like to quit, please type in 1. \n"
							+ "If you would like to continue, please type in 2. \n");
					keepGoing = inp.nextInt();
					if (keepGoing <= 2 && keepGoing >= 1) {
						error = false;
					}
				}

			}
			if (keepGoing == 1) {
				System.out.printf("Thank you and goodbye!");
				break;
			}
		}
	}
	// This main method will ask the user which ship properties to print.
}

/*
 * In this program, I first started out by getting all the classes set up. then
 * I created a User Interface, so the user can choose which ship he or she would
 * like to see the properties of. I created an array of objects, initially it
 * was five objects, but I changed it to three for all three of the different
 * types of ships given to us. Program ends when it asks user if they are done.
 * the user can see the properties for all of the ships, or just one ship.
 */
