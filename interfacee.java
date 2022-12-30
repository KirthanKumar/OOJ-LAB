import java.util.*;

interface students {
    public void generateResult();

    public String getCourseGrade();

    public void setScore(int scoreNumber, int score);

    public int getScore(int scoreNumber);
}

class Undergraduate implements students {
    protected final int NumberOfScores = 4;
    protected String name;
    protected int[] scores = new int[NumberOfScores];

    protected String courseGrade;

    public Undergraduate(String name) {
        this.name = name;
        System.out.println("Student name is : " + name);
    }

    public String getCourseGrade() {

        return courseGrade;

    }

    public void setScore(int scoreNumber, int score) {

        scores[scoreNumber] = score;

    }

    public int getScore(int scoreNumber) {

        return scores[scoreNumber];

    }

    public void generateResult() {
        double total = 0;

        for (int i = 0; i < NumberOfScores; i++) {
            total += scores[i];
        }

        if (total / NumberOfScores >= 70)
            courseGrade = "Pass";
        else
            courseGrade = "Fail";
    }
}

class Graduate implements students {
    protected final int NumberOfScores = 4;
    protected int[] scores = new int[NumberOfScores];
    protected String name;
    protected String courseGrade;

    public Graduate(String name) {
        this.name = name;
        System.out.println("Student name is : " + name);
    }

    public String getCourseGrade() {

        return courseGrade;

    }

    public void setScore(int scoreNumber, int score) {

        scores[scoreNumber] = score;

    }

    public int getScore(int scoreNumber) {

        return scores[scoreNumber];

    }

    public void generateResult() {
        double total = 0;

        for (int i = 0; i < NumberOfScores; ++i) {
            total += scores[i];
        }

        if (total / NumberOfScores >= 70)
            courseGrade = "Pass";
        else
            courseGrade = "Fail";
    }
}

public class interfacee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoice 1: Under graduate\nChoice 2: Graduate\n");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter name : ");
            String st = sc.nextLine();
            Undergraduate u = new Undergraduate(sc.nextLine());
            for (int i = 0; i < 4; i++) {
                System.out.println("Enter the " + (i + 1) + " test score: ");
                int scor = sc.nextInt();
                u.setScore(i, scor);
            }
            u.generateResult();
            System.out.println("Test result: " + u.getCourseGrade());
        } else if (choice == 2) {
            System.out.println("Enter name : ");
            String st = sc.nextLine();
            Graduate g = new Graduate(sc.nextLine());
            for (int i = 0; i < 4; i++) {
                System.out.println("Enter the " + (i + 1) + " test score: ");
                int scor = sc.nextInt();
                g.setScore(i, scor);
            }
            g.generateResult();
            System.out.println("Test result: " + g.getCourseGrade());
        }

        sc.close();
    }

}