
import java.util.Scanner;

public class quadratic {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are real and distinct and the root values are" + r1 + " and" + r2);
        } else if (d == 0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The roots are real and equal and the root value is " + r1);
        } else {
            System.out.print("The roots are Imaginary");
        }
        input.close();
    }

}
