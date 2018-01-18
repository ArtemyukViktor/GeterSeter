public class Encapsulate {
	private static String firstName;
	String lastname;
	int age;

	Encapsulate(String firstName, String lastname, int age) {

		setFirstName(firstName);
		this.lastname = lastname;
		this.age = age;

	}

	static boolean MoznoStvority(String firstName, String lastname) {

		return firstName.length() < 7;
	}

	public String toString() {

		return String.format("%s %s %d", getFirstName(), lastname, age);

	}

	static String getFirstName() {
		return firstName;
	}

	static void setFirstName(String fn) {
		firstName = fn;
	}

}
