package october15;

public class StringChecker {
	
	// checks if two strings are rotations of each other
	public static boolean checkRotation(String str1, String str2) {
		
		boolean result = true;
		
		
		// if they're not the same length, they can't be rotations
		if(str1.length() != str2.length()) {
			result = false;
		}
		// if str2 is not a substring of the concatenation str1+str1, it is not a rotation
		if(!(str1+str1).contains(str2)) {
			result = false;
		}
		
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		checkRotation("apple", "leapp"); //should be true
		checkRotation("orange", "oorange");//should be false
		checkRotation("banana", "abanna");//should be false
	}

}
