import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long result = 1;
		
		System.out.println("Please enter a number: ");
		
		int userNum = scan.nextInt();
		
		result = fact(result, userNum);
		System.out.println(result);
		
		System.out.println("The example below is recursion");
		
		System.out.println(fact2(userNum));
		
		scan.close();
	}

	private static long fact(long result, int userNum) {
		for (int i = 1; i <= userNum; i++) {
			result *= i;
			
		}
		return result;
	}
	
	// this is recursion - just an option?
	public static long fact2(int input) {
		if (input == 1 || input == 0) {
			return 1; //always need stop condition
	}
		
		return input * fact2(input -1); //fact2 shows a smaller chunk 
	}

}