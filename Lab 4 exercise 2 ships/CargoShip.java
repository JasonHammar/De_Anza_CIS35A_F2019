package excercise2ships;

public class CargoShip extends Ship {

	// String[] shipProperties = new String[5];
	private boolean floating = true;
	private int capacity = 100;
	private String length = "1500 feet";
	private String width = "150 feet";
	private String name = getName();
	private String height = "350 feet";
	private String origin = "Ireland";
	private String departureDate = "April 1st";
	private String arrivalDate = "May 31st";
	private String departingPort = "Alcatraz";
	private String arrivalPort = "Alaska port";
	private String owner = "Al Capone";
	private String cargoType = "Valuables";
	private String loadingMethod = "Forklift and Crane";
	private int numberOfCranes = 5;
	private String contraband = "Alcohol";
	private String cargoValue = "$2,000,000";

	public void print() {
		System.out.printf("Floats: %b\n", floating);
		System.out.printf("Capacity: %d\n", capacity);
		System.out.printf("Length: %s\n", length);
		System.out.printf("Width: %s\n", width);
		System.out.printf("Name: %s\n", name);
		System.out.printf("Height: %s\n", height);
		System.out.printf("Origin: %s\n", origin);
		System.out.printf("Departure Date: %s\n", departureDate);
		System.out.printf("Arrival Date: %s\n", arrivalDate);
		System.out.printf("departing Port: %s\n", departingPort);
		System.out.printf("Arrival Port: %s\n", arrivalPort);
		System.out.printf("Owner: %s\n", owner);
		System.out.printf("Cargo Type: %s\n", cargoType);
		System.out.printf("Method of Loading: %s\n", loadingMethod);
		System.out.printf("Number of Cranes Used: %s\n", numberOfCranes);
		System.out.printf("Type of contraband: %s\n", contraband);
		System.out.printf("Value of Cargo: %s\n", cargoValue);

		// This print method will override the initial print method in ship and prints
		// out the properties for the regular ship and the additional properties for the
		// cargo ship.
	}

	public String getName() {
		return name;
		// Overrides ship get name to get the name of the cargo ship.
	}

	public void setName(String name) {
		this.name = name;
		// Overrides ship set name method to set the name of the cargo ship.
	}

}

/* In this program, I first started out by getting all the classes set up. then
 * I created a User Interface, so the user can choose which ship he or she would
 * like to see the properties of. I created an array of objects, initially it
 * was five objects, but I changed it to three for all three of the different
 * types of ships given to us. Program ends when it asks user if they are done.
 * the user can see the properties for all of the ships, or just one ship.
 */