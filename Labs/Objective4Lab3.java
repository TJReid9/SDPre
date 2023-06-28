import java.util.Scanner;
import java.time.Year;

public class Objective4Lab3 {
	public static void main(String[] args) {
		int birthYear, age, currentYear;

		birthYear = 0;


		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
			age = keyboard.nextInt();
			keyboard.close();

		currentYear = 2023;
		birthYear = (currentYear - age);
		


		System.out.println("You were born in " + birthYear);
		keyboard.close();
	}
}