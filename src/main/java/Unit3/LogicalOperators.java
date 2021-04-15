package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/11/2021
 * Logical Operators: and, or, not
 * and - &&
 * or - ||
 * not - !
 */
public class LogicalOperators {

	public static void main(String[] args) {
		// voting
		int age = 20;
		boolean isCitizen = true;
		
		if ((age >= 18) && (isCitizen == true)) {
			System.out.println("You are eligible to vote");
		}
		else if ((age < 18) && (isCitizen == true)) {
			System.out.println("You are not old enough");
		}
		else if (age >= 18 && isCitizen == false) {
			System.out.println("You are not a US citizen");
		}
		else 
			System.out.println("You are not elgible to vote at all because you are not old enough and you are not a US citizen");

		// vaccine
		// age > 65, Healthcare, Frontline
		
		int v_age = 66;
		boolean isHealthCare = false;
		boolean isFrontLine = true;

		if (v_age >= 16 && v_age < 65) {
			if (isHealthCare == true || isFrontLine == true) {
				System.out.println ("You are eligible to get vaccinated");
			} 
			else {
				System.out.println ("You are not eligible to get vaccinated");
			}
		}
		else if (v_age >= 65) {
			System.out.println("You are eligible to get vaccinated");
		}
	}

}
