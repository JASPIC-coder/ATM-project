import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to ATM Simulator!\n ");
        // Initialize ATM with an initial balance of 100.0
        ATM atm = new ATM(100.0);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        atm.deposit(amount);
        // Perform deposit operation
        System.out.print("Enter amount to withdraw: ");
        amount = input.nextDouble();
        atm.withdraw(amount);
        // Perform withdrawal operation

        // Check final balance
        atm.checkBalance();
    }
}
