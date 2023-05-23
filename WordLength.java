public class WordLength {
    public static void main(String[] args) {
        String[] words = {"Apple", "bananana", "kiwi", "berry", "almond"};
        int k = 5;
        
        wordsGreaterThanK(words, k);
    }
    
    public static void wordsGreaterThanK(String[] words, int k) {
        System.out.println("Words greater than length " + k + ":");
        
        for (String word : words) {
            if (word.length() > k) {
                System.out.println(word);
            }
        }
    }
}