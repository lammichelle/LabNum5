import java.util.Scanner;

public class MethodPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MethodPractice test = new MethodPractice(); //instance
		test.sayHello(); 
		
		System.out.println("Please enter a name: ");
		String name = scan.nextLine();
		String hi = sayHelloName(name);
		System.out.println(hi);
		
		System.out.println(addTwenty(100)); 
		System.out.println(checkSeven(3,4, "K"));
		
		scan.close();
	}
	
	
	
	//because this method is not static we need to create
	//an instance of the object that the method lives in to use it	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	
	// 5 steps for writing methods
	
	// 1. visibility modifier (required): let's you know where the method
	// can be seen/used
	// 2. use the static keyword or nothing at all (if not static, we need to create
	// an object to call it)
	// 3. return type :should match what you need returned, if nothing use void
	// 4. method name: should be a verb to show action
	// 5. parameter list: things we need to use in the method, it can be blank
	// methods can only return 1 thing
	
	public static String sayHelloName(String name) {
		String sayHi = "Hello, " +name;
		
	
		return sayHi; //this is a string and matches the type (step3)
	}	

	
	
	private static int addTwenty(int userNum){
		
		
		return userNum + 20; 
	}
	
	public static boolean checkSeven(int userNum, int userNum2, String name) {
		if (userNum + userNum2 == 7 || name.equals("John")) {
			return true;
		}
		return false;
	}
	
	
}
