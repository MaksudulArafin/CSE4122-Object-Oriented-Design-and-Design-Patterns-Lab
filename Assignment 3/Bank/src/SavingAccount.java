class SavingAccount implements Account {

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing $" + amount + " into Saving Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount + " from Saving Account");
    }
}
