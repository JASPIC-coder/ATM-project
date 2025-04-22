public class ATM {
    private double balance;

    // Constructor to set initial balance
    public ATM(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            balance = 0;
        } else {
            balance = initialBalance;
        }
        System.out.println("ATM initialized with balance: " + this.balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public  void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance! Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
