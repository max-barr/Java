public class BankAccount {
    // Class attributes
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;

    // Static members
    public static int totalAccounts = 0;
    public static double totalMoney = 0.00;

    // Constructor
    public BankAccount() {
        totalAccounts++;
    }

    // Getters and Setters
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Class methods
    

    public void viewAccounts() {
        System.out.println("Checking Balance: " + getCheckingBalance());
        System.out.println("Savings Balance: " + getSavingsBalance());
    }
}