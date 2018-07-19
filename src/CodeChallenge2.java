import java.util.Scanner;

/*
 * 
 * Given a string ("out") with a length of 4 characters, such as "<<>>", 
 * and a word, return a new string where the word 
 * is in the middle of the out string, e.g. "<<word>>".
 * Note: use str.substring(i, j) to extract the 
 * String starting at index i and going up to but not including index j.
 * makeOutWord("<<>>", "Yay") = "<<Yay>>"
 * makeOutWord("<<>>", "WooHoo") = "<<WooHoo>>"
 * makeOutWord("[[]]", "word") = "[[word]]"
 * 
 */
public class CodeChallenge2 {

	public static void main(String[] args) {
		//Scanner scnr = new Scanner(System.in);
		//System.out.println("Please enter 4 characters: ");
		//String out = scnr.next();
		//System.out.println("Please enter one word");
		//String word = scnr.next();
		
		System.out.println(makeNewString("<<<<","yay"));
	}
	
	

	public static String makeNewString(String out, String word) {

		String result = out.substring(0, 2) + word + out.substring(2,4);

			
	return result; 
	}
}