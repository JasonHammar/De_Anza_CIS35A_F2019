package excercise2ships;

public class CruiseShip extends Ship {
	// String[] shipProperties = new String[5];
	private boolean floating = true;
	private int capacity = 1700;
	private String length = "500 feet";
	private String width = "200 feet";
	private String name = getName();
	private String height = "200 feet";
	private String origin = "United States";
	private String departureDate = "August 26th";
	private String arrivalDate = "December 3rd";
	private String departingPort = "New York Port";
	private String arrivalPort = "Malaysia Port";
	private String owner = "Jack";
	private String ticketPrice = "$200 dollars";
	private int numberOfRooms = 217;
	private String buffetMenu = "Salad, Shrimp, Chicken, Sushi, and Chips";
	private String services = "Room Service, Laundry, and Food";
	private String cruiseType = "Yacht";

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
		System.out.printf("Ticket Price: %s\n", ticketPrice);
		System.out.printf("Number of rooms Available: %d\n", numberOfRooms);
		System.out.printf("Buffet Menu: %s\n", buffetMenu);
		System.out.printf("Available Services: %s\n", services);
		System.out.printf("Cruise Type: %s\n", cruiseType);

		// This print method will override the ship print method and print out the
		// properties for a regular ship plus the properties for the cruise ship.
	}

	public String getName() {
		return name;
		// Overrides ship get name to get the name of the cruise ship.
	}

	public void setName(String name) {
		this.name = name;
		// Overrides ship set name method to set the name of the cruise ship.
	}
}

/* In this program, I first started out by getting all the classes set up. then
 * I created a User Interface, so the user can choose which ship he or she would
 * like to see the properties of. I created an array of objects, initially it
 * was five objects, but I changed it to three for all three of the different
 * types of ships given to us. Program ends when it asks user if they are done.
 * the user can see the properties for all of the ships, or just one ship.
 */