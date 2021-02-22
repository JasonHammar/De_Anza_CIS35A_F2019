package excercise2ships;

public class Ship {
	// String properties[];
	private boolean floating = true;
	private int capacity = 2700;
	private String length = "2500 feet";
	private String width = "500 feet";
	private String name = getName();
	private String height = "100 feet";
	private String origin = "Spain";
	private String departureDate = "January 18th";
	private String arrivalDate = "February 28th";
	private String departingPort = "Boston Port";
	private String arrivalPort = "Hong Kong Port";
	private String owner = "Peter Parker";

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
		// This method is the initial ship class print method and prints out all the
		// properties for the regular ship.
	}

	public String getName() {
		return name;
		// Gets the name of the ship.
	}

	public void setName(String name) {
		this.name = name;
		// Sets the name of the ship.
	}

}

/* In this program, I first started out by getting all the classes set up. then
 * I created a User Interface, so the user can choose which ship he or she would
 * like to see the properties of. I created an array of objects, initially it
 * was five objects, but I changed it to three for all three of the different
 * types of ships given to us. Program ends when it asks user if they are done.
 * the user can see the properties for all of the ships, or just one ship.
 */