import java.util.ArrayList;
import java.util.Scanner;

public class lab4 {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private ArrayList<String> transactions;

    public void initializeAccount(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.transactions = new ArrayList<String>();
        this.transactions.add(String.format("Account initialized with balance of %.2f", accountBalance));
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
        this.transactions.add(String.format("Deposited %.2f", amount));
    }
    public void withdraw(double amount) {
        if (this.accountBalance < amount) {
            System.out.println("Insufficient funds");
        } else {
            this.accountBalance -= amount;
            this.transactions.add(String.format("Withdrawn %.2f", amount));
        }
    }

    public void printTransactions() {
        for (String transaction : this.transactions) {
            System.out.println(transaction);
        }
    }

    public void printSummary() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Balance: " + this.accountBalance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int choice;

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.next();
        System.out.print("Enter Account Balance: ");
        double accountBalance = scanner.nextDouble();
        account.initializeAccount(accountNumber, accountHolderName, accountBalance);

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Print Transactions");
            System.out.println("4. Print Account Summary");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.printTransactions();
                    break;
                case 4:
                    account.printSummary();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (!quit);

        scanner.close();
    }
}






