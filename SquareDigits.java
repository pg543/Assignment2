import java.util.Scanner;

public class SquareDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = sc.nextInt();

        int result = squareNumber(inputNumber);

        System.out.println("The square of " + inputNumber + " is " + result);
    }

    public static int squareNumber(int number) {
        int square = number * number;
        return square;
    }
}
