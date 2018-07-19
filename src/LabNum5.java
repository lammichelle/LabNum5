import java.util.Scanner;

public class LabNum5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String answer; 
		
		do {
		System.out.println("Enter a number between 1-10: ");
		long userInput = scan.nextInt();
		
		long fact = 1; //initial number
		
		if(userInput <= 10 && userInput>0) {
			for (int i = 1; i <= userInput; i++) {
				fact = fact * i;
				//can also be written as fact *= i;
			}
			System.out.println("The factorial of " +userInput+ " is " + fact);
		
			
		}else {
			System.out.println("Invalid Input");
		}
		
		System.out.println("Continue?(y/n)");
		answer = scan.next();
		
		if(answer.equalsIgnoreCase("n")) {
		System.out.println("Bye!");
		break;
		}
		
		}while(answer.equalsIgnoreCase("y"));
		
	}		
	}


