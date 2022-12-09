/* 
4. Develop a Java program to create an abstract class named Shape that contains two integers 
and an empty method named printArea( ). Provide three classes named Rectangle, Triangle and Circle 
such that each one of the classes extends the class Shape. Each one of the classes contains only 
the method printArea( ) that prints the area of the given shape.*/
import java.util.*;

abstract class shape {
    double a, b;

    abstract void printarea();
}

class triangle extends shape {
    triangle(double x, double y) {
        a = x;
        b = y;
    }

    void printarea() {
        double area = 0.5 * a * b;
        System.out.println("Area of triangle= " + area);
    }
}

class rectangle extends shape {
    rectangle(double x, double y) {
        a = x;
        b = y;
    }

    void printarea() {
        double area = a * b;
        System.out.println("Area of rectangle= " + area);
    }
}

class circle extends shape {
    circle(double x) {
        a = x;
    }

    void printarea() {
        double area = 3.142 * a * a;
        System.out.println("Area of circle= " + area);
    }
}

class abstractt {
    public static void main(String args[]) {
        int ch;
        boolean x = true;
        Scanner sc = new Scanner(System.in);
        while (x == true) {
            System.out.println(
                    "1. Area of rectangle\n2. Area of triangle\n3.Area of circle\n4.Exit\nEnter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter length and breadth: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    rectangle r = new rectangle(l, b);
                    r.printarea();
                    break;
                case 2:
                    System.out.println("Enter base and height: ");
                    double b1 = sc.nextDouble();
                    double h = sc.nextDouble();
                    triangle t = new triangle(b1, h);
                    t.printarea();
                    break;
                case 3:
                    System.out.println("Enter radius: ");
                    double r1 = sc.nextDouble();
                    circle c = new circle(r1);
                    c.printarea();
                    break;
                case 4:
                    x = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        sc.close();
    }
}