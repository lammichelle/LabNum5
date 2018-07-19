
public class StringBuffBuildEx {

	public static void main(String[] args) {

		// stringbuffer makes strings mutable (meaning you can change them without
		// hurting memory)
		// stringbuffer is older than stringbuilder and is thread safe

		StringBuffer sb = new StringBuffer("Java is so cool"); // since it is part of the system

		sb.append(", it is also the best language to learn");
		// kind of like concatenate

		System.out.println(sb);
		int stringLength = sb.length();
		System.out.println(stringLength);
		sb.append(" We love this stuff!");
		System.out.println(sb.reverse().toString().toUpperCase());
		// now it's a string
		// when changing to uppercase method, must first switch stringbuffer to a string
		System.out.println();
		// StringBuilder is new and faster, but has all the same methods
		// as the stringbuffer
		StringBuilder sb2 = new StringBuilder(); // empty to start
		sb2.append("This lets me add some string data");
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.reverse().toString().toLowerCase());
		
		
		String letters = "abcdefghijkl";
		
		for (int i = 0; i <letters.length(); i++) {
			System.out.println(letters.charAt(i));
			
		}
	}

}
