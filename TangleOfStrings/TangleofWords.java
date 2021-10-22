import java.util.Scanner;
public class TangleofWords {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is the password?");
	String myString = scanner.nextLine();
	String password2 = "me";
	System.out.println(myString.matches(password2));
	if (myString.matches(password2)) {
		menu();
	}else {
		System.out.println("End of Program");
	}
	int number = scanner.nextInt();
	if (number <= 6) {
		System.out.println("What String would you like to use?");
			}
	String String2 = scanner.nextLine();
			if (number == 1) { // Reverses the letter order.
				System.out.println(String2);
			}
			if (number == 2) { //only produces words of a certain length
				System.out.println(String2);
			}
			if (number == 3) { //prints out number of vowels in string
				System.out.println(String2);
			}
			if (number == 4) { //Changes upper case to lower and lower to upper case
				System.out.println(String2);
			}
			if (number == 5) { //Compares to strings to check if they are equal
				System.out.println(String2);
			}				
			if (number == 6) { //Finds word in a string and replaces it with new word.
				System.out.println(String2);
			}
			if (number == 7) {
				System.out.println("End of Program");
			}
}
public static void menu() {
	System.out.println("1. Print my String Backwards");
	System.out.println("2. Make a list of words in my string with a given length");
	System.out.println("3. Print out number of vowels in my string");
	System.out.println("4. Inverse the character case of my string");
	System.out.println("5. Compare to a second string for content equality");
	System.out.println("6. Replace a word in your string with a new word");
	System.out.println("7. Quit");
	}
//Scanner scanner = new Scanner(System.); // Trying to close the scanner
}