public class SpecialCharacter {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        boolean containsSpecialCharacter = checkForSpecialCharacter(inputString);
        
        if (containsSpecialCharacter) {
            System.out.println("The string contains special characters.");
        } else {
            System.out.println("The string does not contain any special characters.");
        }
    }
    
    public static boolean checkForSpecialCharacter(String str) {
        String specialCharacters = "!@#$%^&*()-+={}[]|\\;:'\"<>,.?/~`";
        
        for (char c : str.toCharArray()) {
            if (specialCharacters.contains(Character.toString(c))) {
                return true;
            }
        }
        
        return false;
    }
}
