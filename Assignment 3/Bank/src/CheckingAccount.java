class CheckingAccount implements Account {

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing $" + amount + " into Checking Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount + " from Checking Account");
    }
}
