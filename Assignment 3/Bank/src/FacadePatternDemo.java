public class FacadePatternDemo {

    public static void main(String[] args) {

        BankingFacade bank = new BankingFacade();

        bank.depositToChecking(5000);
        bank.withdrawFromSaving(2000);
        bank.investMoney(10000);
    }
}
