import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in); // accepting user input - wait for input to continue program

    public static void main(String[] args) {
        
        // DECLARE VARIABLES
        double balance = 0; // decimal for all balances
        boolean isRunning = true; // check if user exited program or not
        int choice ; // accept choices below

        while (isRunning){ // keeps system running instead of just ending after an option is done with
            // DISPLAY MENU
        System.out.println(" BANKING PROGRAM ");
        System.out.println("*****************");
        System.out.println("Show Balance");
        System.err.println("Deposit");
        System.err.println("Withdraw");
        System.err.println("Exit");
        System.out.println("*****************");

        // GET AND PROCESS USERS CHOICE
        System.err.print("Enter your choice (1-4: ");
        choice = scanner.nextInt(); // take user input 1-4

        switch(choice){ // process user choice 
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }
    }

        // EXIT MESSAGE
    System.out.println("***************************");
    System.out.println("Thank you! Have a nice day!");
    System.out.println("***************************");

        scanner.close(); // stop taking user input when atm ends session
    }

        // showBalance()
    static void showBalance(double balance){
        System.out.println("*****************");
        System.out.printf("$%.2f\n", balance);
    }

    // deposit()
    static double deposit(){  // no params, but will return a double
        
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    // withdraw()
    static double withdraw(double balance){

        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}