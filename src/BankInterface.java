public interface BankInterface {
    double CheckBalance();
    String AddMoney(double money);
    String WithdrawMoney(double money, String enteredPassword);
    double CalculateInterest(int years);
}
