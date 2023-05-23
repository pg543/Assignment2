public class RemoveCharacter {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int indexToRemove = 7;
        
        String result = removeCharacterAtIndex(inputString, indexToRemove);
        System.out.println("Result: " + result);
    }
    
    public static String removeCharacterAtIndex(String str, int index) {
        if (index < 0 || index >= str.length()) {
            return str; // Return the original string if index is out of bounds
        }
        
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);
        return sb.toString();
    }
}