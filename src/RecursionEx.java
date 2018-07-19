import java.util.Scanner;

public class RecursionEx {

	public static void main(String[] args) {
		//create a count down timer ex: stopwatch
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int userNum = scan.nextInt();
		
		countDown(userNum); //why not sysout?

	}
	
	//method that calls itself
	public static void countDown(int num) {
		
		if(num == 0) {
			System.out.println("Times up!");
		} else {
		System.out.println(num);
		countDown(num - 1);
		}
		//return; can use return for void methods, but it's not required
	}

}
