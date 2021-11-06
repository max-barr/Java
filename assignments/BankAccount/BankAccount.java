class BankAccount {
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;
    public static int totalAccounts = 0;
    public static double totalMoney = 0.0;

    // Constructors
    public BankAccount() {
        totalAccounts ++;
    }
    
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
    }

    // Getter methods
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Setter methods
    public double setCheckingBalance(double number) {
        checkingBalance = number;
        return getCheckingBalance();
    }
    public double setSavingsBalance(double number) {
        savingsBalance = number;
        return getSavingsBalance();
    }

    // deposit methods
    public double despositChecking(double money) {
        setCheckingBalance(getCheckingBalance() + money);
        totalMoney += money;
        return getCheckingBalance();
    }
    public double despositSavings(double money) {
        setSavingsBalance(getSavingsBalance() + money);
        totalMoney += money;
        return getSavingsBalance();
    }

    // withdraw methods
    public double withdrawChecking(double money) {
        setCheckingBalance(getCheckingBalance() - money);
        totalMoney -= money;
        return getCheckingBalance();
    }
    public double withdrawSavings(double money) {
        setSavingsBalance(getSavingsBalance() - money);
        totalMoney -= money;
        return getSavingsBalance();
    }

    // View money in checking and savings
    public void viewAccounts() {
        System.out.println("Checking balance: " + getCheckingBalance());
        System.out.println("Savings balance: " + getSavingsBalance());
    }
}