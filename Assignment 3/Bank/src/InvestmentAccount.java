class InvestmentAccount implements Account {

    @Override
    public void deposit(double amount) {
        System.out.println("Investing $" + amount + " in Investment Account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Redeeming $" + amount + " from Investment Account");
    }
}
