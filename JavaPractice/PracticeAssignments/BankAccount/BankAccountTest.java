public class BankAccountTest {
    public static void main(String[] args) {
        // Instantiate object
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();

        a.depositChecking(200);
        a.withdrawChecking(150);
        a.depositSavings(1000);
        a.withdrawSavings(250);
        b.depositChecking(100);
        System.out.println(a.getCheckingBalance());
        System.out.println(a.getSavingsBalance());

        System.out.println(BankAccount.totalAccounts);
        System.out.println(BankAccount.totalMoney);
    }
}