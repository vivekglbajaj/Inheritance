import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String accountHolderName;
    private String accountNumber;
    
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("$"+amount+" has been deposited to your account." + balance);
        }else{
            System.out.println("invalid amount");
        }
    }   
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("$"+amount+" has been withdrawn from your account." + balance);
        }else{
            System.out.println("invalid amount");
        }
    }
    public void checkBalance(){
        System.out.println("Your account balance is: $" + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for initial account details
        System.out.println("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        System.out.println("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a new BankAccount object
        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);

        // Menu for account operations
        while (true) {
            System.out.println("\n=== Bank Account Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank Account System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}