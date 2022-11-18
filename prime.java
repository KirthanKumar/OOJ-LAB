import java.util.Scanner;

public class prime {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = input.nextInt();
        int flag = 0;
        for(int i=2; i<Math.pow(n, 0.5); i++){
            if(n%i == 0){
                flag =0;
                break;
            }
            else{
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.print("This is not a prime number");
        }
        else if(flag ==1){
            System.out.print("This is a prime number");
        }
        input.close();
    }

}
