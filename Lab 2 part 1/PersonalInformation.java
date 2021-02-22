
public class PersonalInformation {
//personal data: name, address, age and phone number. 
	private String name; // data hiding - encapsulation
	private int age;
	private String address;
	private long phone;

//constructors
	

	public PersonalInformation(int age, String name, long phone, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void print() {
		System.out.printf("Name: %s\n", name);
		System.out.printf("Age: %d\n", age);
		System.out.printf("Phone number: %d\n", phone);
		System.out.printf("Address: %s\n", address);
	}
}