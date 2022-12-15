// 5. Develop a Java program to create a class Bank that maintains two kinds of account for its customers, one called Saving Account and the  Current Account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but with no interest. Current account holders should also maintain a minimum balance and if the balance falls below minimum balance, a service charge is imposed(levied).

// Create a class Account that stores customer name, account number and type of account. From this derive the classes CurrentAccount and SavingAccount to make them more specific to their requirements. Include the necessary methods
// in order to achieve the following tasks:

// a)     Accept deposit from customer and update the balance.

// b)     Display the balance.

// c)     Compute and deposit interest

// d)     Permit withdrawal and update the balance

// Check for the minimum balance, impose penalty if necessary and update the balance.

// 1. Program 5, keep fixed minimum balance of of 5000(during account creation of user, please display the information that the minimum balance is 5000) and if the balance is less that minimum balance then levy/impose 10% of penalty. 
// 2. Rate of interest per year must be 6% 

import java.util.*; //The import java. util. *; statement can be used to load the contents of the java. util package in a Java program. It consists of components such as data structures, exceptions, enumerations, utility classes, etc.

class Account {
    Scanner sc = new Scanner(System.in);
    String customerName;
    int accountNumber;
    float balance = 5000;
    double si;

    void inputData() {
        System.out.print("Enter customer name: ");
        customerName = sc.nextLine();
        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }

    void deposit() {
        System.out.print("Enter the amount to be deposited: ");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("The account balance is: " + balance);
    }
}

class CurrentAccount extends Account {
    int serviceFee = 50;

    void cheque() {
        System.out.println("Cheque service available");
    }

    void withdrawal() {
        float amount;
        System.out.println("Enter the amount to be withdrawn");
        amount = sc.nextFloat();
        if (amount > balance)
            System.out.println("Balance insufficient");
        else {
            balance = balance - amount;
            if (balance < 5000) {
                balance = balance - serviceFee;
                System.out.println("50 rs is deducted as service fee");
            }
            System.out.println("Withdrawn : " + amount);
            System.out.println("Current balance : " + balance);
        }
    }
}

class SavingsAccount extends Account {
    void cheque() {
        System.out.println("Cheque service not available");
    }

    void withdrawal() {
        float amount;
        System.out.println("Enter the amount to be withdrawn");
        amount = sc.nextFloat();
        if (amount > balance)
            System.out.println("Balance insufficient");
        else
            balance = balance - amount;
        System.out.println("Withdrawn : " + amount);
        System.out.println("Current balance : " + balance);
    }

    void interest() {

        double r = 0.06;
        System.out.println("Enter the time period of deposit: ");
        int t = sc.nextInt();
        si = balance * t * (1 + r);
        System.out.println("Simple interest is " + si);
    }
}

public class Bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();
        System.out.println("\n1.Savings account\n2.Current account");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                boolean boo = true;
                while (boo) {
                    System.out.println(
                            "\n1.Input Details\n2.Display Details\n3.Cheque Available?\n4.Deposit\n5.Calculate Interest\n6.Withdraw Amount\n7.Exit");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            sa.inputData();
                            break;
                        case 2:
                            sa.display();
                            break;
                        case 3:
                            sa.cheque();
                            break;
                        case 4:
                            sa.deposit();
                            break;
                        case 5:
                            sa.interest();
                            break;
                        case 6:
                            sa.withdrawal();
                            break;
                        case 7:
                            boo = false;
                            break;
                        default:
                            System.out.print("Enter other choice");
                            break;
                    }
                }
                break;
            case 2:
                boolean booo = true;
                while (booo) {
                    System.out.println(
                            "\n1.Input Details\n2.Display Details\n3.Cheque Available?\n4.Deposit\n5.Withdraw Amount\n6.Exit");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            ca.inputData();
                            break;
                        case 2:
                            ca.display();
                            break;
                        case 3:
                            ca.cheque();
                            break;
                        case 4:
                            ca.deposit();
                            break;
                        case 5:
                            ca.withdrawal();
                            break;
                        case 6:
                            booo = false;
                            break;
                        default:
                            System.out.print("Enter other choice");
                            break;
                    }
                }
                break;
        }
        sc.close();
    }
}