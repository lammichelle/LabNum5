import java.util.Random;
import java.util.Scanner;

public class Lab6Num {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.println("How many sides? ");

			int sides = scan.nextInt();
			System.out.println(roll(sides));
			
			int num1 = roll(sides);
			int num2 = roll(sides);
			System.out.println(num1 + " " + num2);
			special(num1, num2);

			System.out.println("Roll again?(y/n)");
			answer = scan.next();
			
			if(answer.equalsIgnoreCase("n")) {
				System.out.println("Goodbye!");
			}
		} while (answer.equalsIgnoreCase("y"));

	}

	//creating a second method for random number
	private static int roll(int sides) {
		Random rand = new Random();
		// this gets a random side from the inputed
		int randomside = rand.nextInt(sides);
		return randomside + 1;
	}

	//another method to determine snake eyes 1&1, boxcars 6&6, craps x+y=7 or x+y=11
	private static void special(int num1, int num2) {

		// snake eyes
		if (num1 == 1 && num2 == 1) {
			System.out.println("Snake eyes");
		}
		// boxcars
		else if (num1 == 6 && num2 == 6) {
			System.out.println("Boxcars");
		}
		// craps
		else if (num1 + num2 == 7 || num1 + num2 == 11) {
			System.out.println("Craps");
		}

	}

}
