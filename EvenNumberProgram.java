
public class EvenNumberProgram {
    public static void main(String[] args) {

        System.out.println("Even numbers between 2000 and 4000:");
        for (int number = 2000; number <= 4000; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
