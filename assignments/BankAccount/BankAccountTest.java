class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println(account1.getCheckingBalance());

        account1.despositChecking(50.75);
        account1.despositChecking(95.34);
        account1.despositSavings(6000);
        account1.withdrawChecking(20.50);
        account1.withdrawSavings(999);
        account1.viewAccounts();

        System.out.println(BankAccount.totalAccounts);
        System.out.println(BankAccount.totalMoney);
    }
}