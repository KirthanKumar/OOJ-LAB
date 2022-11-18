import java.util.Scanner;

public class Factorial {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
        input.close();
    }

}
