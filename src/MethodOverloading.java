
public class MethodOverloading {

	public static void main(String[] args) {
		
		int num = 5;

		System.out.println(modifyMe(num));
		System.out.println(num);
		
		//System.out.println(modifyMe(4, 3));
		//System.out.println(modifyMe(2, "6"));

	}

	// Method Overloading
	// 1. Method must have same name (don't have to be / return the same type - ex: int vs
	// boolean vs double)
	// 2. Must have one of the following differences:
	// 		a. Diff parameter type
	// 		b. Diff parameter order
	// 		c. Diff amount of parameters

	public static int modifyMe(int num) {
		// sysout to test some stuff
		System.out.println("testing to make sure we are right");
		return num * 56;
	}
	//the compiler knows which method to run based on our parameter list
	public static int modifyMe(int num, int num2) {
		return num * num2;
	}
	
	public static int modifyMe(int userNum1, String num) {
		int value = Integer.parseInt(num); //casting string num to int bc we want same data type , can be vice versa
		return userNum1 + value; 
	}

}
