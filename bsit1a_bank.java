import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double balance = 0.0;
        
        System.out.println("=============================");
        System.out.println("   Welcome to BSIT-1A's BANK");
        System.out.println("=============================\n");
        
        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int userChoice = userInput.nextInt();
            
            if (userChoice == 1) {
                System.out.print("Enter amount to deposit: ");
                double deposit = userInput.nextDouble();
                balance += deposit;
                
                if (deposit > 0) {
                    System.out.println("Successfully deposited P" + deposit);
                    System.out.println("Your balance is now P" + balance);
                    
                    System.out.println("\n------ Transaction Receipt ------");
                    System.out.println("Simple Bank Official Receipt");
                    System.out.println("Date/Time: 10-2025-27 05:18:18");
                    System.out.println("Transaction: Deposit");
                    System.out.println("Amount: P" + deposit);
                    System.out.println("New Balance: P" + balance);
                    System.out.println("---------------------------------\n\n");
                } else {
                    System.out.println("Invalid deposit amount!\n");
                }
            } else if (userChoice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double withdraw = userInput.nextDouble();
                balance -= withdraw;
                
                if (withdraw > 0) {
                    System.out.println("Successfully withdrew P" + withdraw);
                    System.out.println("Your balance is now P" + balance);
                    
                    System.out.println("\n------ Transaction Receipt ------");
                    System.out.println("Simple Bank Official Receipt");
                    System.out.println("Date/Time: 2025-10-27 05:18:24");
                    System.out.println("Transaction: Withdraw");
                    System.out.println("Amount: P" + withdraw);
                    System.out.println("New Balance: P" + balance);
                    System.out.println("---------------------------------\n\n");
                } else {
                    System.out.println("Insufficient balance!");
                }
            } else if (userChoice == 3) {
                if (balance == 300) {
                System.out.print("Your current balance is P" + balance);
                
                System.out.println("\n\n------ Transaction Receipt ------");
                System.out.println("Simple Bank Official Receipt");
                System.out.println("Date/Time: 2025-10-27 05:18:28");
                System.out.println("Transaction: Balance Inquiry");
                System.out.println("Current Balance: P" + balance);
                System.out.println("---------------------------------\n\n");
                } else {
                System.out.print("Your current balance is P" + balance);
                
                System.out.println("\n\n------ Transaction Receipt ------");
                System.out.println("Simple Bank Official Receipt");
                System.out.println("Date/Time: 2025-10-27 05:18:48");
                System.out.println("Transaction: Balance Inquiry");
                System.out.println("Current Balance: P" + balance);
                System.out.println("---------------------------------\n\n");
                }
                
            } else if (userChoice == 4) {
                System.out.println("Thank you for banking with us!");
                System.out.println("\nThank you for banking with Simple Bank!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
            System.out.print("Do you want to perform another transaction? (Y/N): ");
            char continueTransaction = userInput.next().charAt(0);
            
            System.out.println();
        
            if (continueTransaction == 'N' || continueTransaction == 'n') {
                System.out.println("Thank you for banking with Simple Bank!");
                break;
            } 
        } 
    }
}
