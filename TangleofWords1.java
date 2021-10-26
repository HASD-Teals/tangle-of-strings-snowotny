import java.util.Scanner;
public class TangleofWords1 {
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
		String String2 = scanner.nextLine();
			}
			if (number == 1) { // Reverses the letter order.
				String String2 = scanner.nextLine();
				phraseReverse(String2);
			}
			if (number == 2) { //only produces words of a certain length
				String String2 = scanner.nextLine();
				wordList(String2);
			}
			if (number == 3) { //prints out number of vowels in string
				String String2 = scanner.nextLine();
				vowels(String2);
			}
			if (number == 4) { //Changes upper case to lower and lower to upper case
				String String2 = scanner.nextLine();
				caseInverse(String2);
			}
			if (number == 5) { //Compares to strings to check if they are equal
				String String2 = scanner.nextLine();
				System.out.println("What would you like the second string to contain?");
				String String3 = scanner.nextLine();
				isMatch(String2, String3);
			}				
			if (number == 6) { //Finds word in a string and replaces it with new word.
				String String2 = scanner.nextLine();
				findReplace(String2);	
			}
			if (number == 7) {
				System.out.println("End of Program");
			}
}
public static void menu() {
	System.out.println("Input a number corresponding to the selction on the menu");
	System.out.println("1. Print my String Backwards");
	System.out.println("2. Make a list of words in my string with a given length");
	System.out.println("3. Print out number of vowels in my string");
	System.out.println("4. Inverse the character case of my string");
	System.out.println("5. Compare to a second string for content equality");
	System.out.println("6. Replace a word in your string with a new word");
	System.out.println("7. Quit");
	}
public static void phraseReverse(String String2) {
	System.out.println(String2);
}
public static void wordList(String String2) {
	System.out.println(String2);
}
public static void vowels(String String2) {
	System.out.println(String2);
}
public static void caseInverse(String String2) {
	System.out.println(String2.toUpperCase());
}
public static void isMatch(String String2, String String3) {
	System.out.print("The result of the matching is : ");
	System.out.println(String2.matches(String3));
}
public static void findReplace(String String2) {
	System.out.println("Your new String is : ");
	System.out.println(String2);
}
}