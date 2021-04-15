package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/17/2021
 * Compare String Objects
 */

public class StringComparison {

	public static void main(String[] args) {
		String name1;
		String name2;
		name1 = "Java";
		name2 = "Java";
		
		// name1 == name2 will compare the addresses
		
		if (name1.equals(name2)) {
			System.out.println("name1 is equal to name2");
		}
		else {
			System.out.println("name1 is not equal to name2");
		}
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("name1 is equal to name2");
		}
		else {
			System.out.println("name1 is not equal to name2");
		}

	}

}
