package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/17/2021
 * Learning switch cases
 */
public class SwitchIntro {

	public static void main(String[] args) {
		int grade = 9;

		if(grade == 9) {
			System.out.println("Freshman");
		}
		else if (grade == 10) { 
			System.out.println("Sophomore");
		}

		else if (grade == 11) { 
			System.out.println("Junior");
		} 
		
		else if (grade == 12) { 
			System.out.println("Senior");
		}
		
		else {
		System.out.println("Not a high school grade");
		}
		
		// when the same variable is checked with 
		// different values - we can use switch-case

		switch (grade) {
		case 9:
			System.out.println("Freshman");
		case 10:
			System.out.println("Sophomore");

		case 11:
			System.out.println("Junior");

		case 12:
			System.out.println("Senior");

		default:
			System.out.println("Not a high school grade");
		}
		
		char ch = 'a';
		switch (ch) {
		case 'a': // using ||(or)
		case 'A': // using if(ch == 'a' || ch == 'A')
			System.out.println("The alphabet is a");
			break;
		case 'b':
		case 'B':
			System.out.println("The alphabet is b");
			break;
		}

	}
}
