class BankingFacade {

    private Account checking;
    private Account saving;
    private Account investment;

    public BankingFacade() {
        checking = new CheckingAccount();
        saving = new SavingAccount();
        investment = new InvestmentAccount();
    }

    public void depositToChecking(double amount) {
        checking.deposit(amount);
    }

    public void withdrawFromSaving(double amount) {
        saving.withdraw(amount);
    }

    public void investMoney(double amount) {
        investment.deposit(amount);
    }
}
