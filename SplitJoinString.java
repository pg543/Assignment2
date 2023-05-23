
public class SplitJoinString {
	public static void main(String[] args) {
	String inputString = "Hello, World";

 // Splitting the string
	String[] splitArray = inputString.split(" ");

// Joining the string
	String joinedString = String.join("", splitArray);

// Printing the results
	System.out.println("Original String: " + inputString);
	System.out.println("Split Array: ");
    for (String str : splitArray) {
    	System.out.println(str);
    }
    System.out.println("Joined String: " + joinedString);
    }
}