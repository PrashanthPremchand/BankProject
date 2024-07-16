import java.util.*;

public class SBIUser implements BankInterface{
    String name;
    String accountNo;
    double balance;
    String password;
    double rateOfInterest;

    public SBIUser(String name, String password, double balance) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        accountNo = String.valueOf(UUID.randomUUID());
        rateOfInterest = 6.5;
    }

    @Override
    public double CheckBalance() {
        return balance;
    }

    @Override
    public String AddMoney(double money) {
        balance = balance + money;
        return "kasu panam thuttu money " + balance;
    }

    @Override
    public String WithdrawMoney(double money, String enteredPassword) {
        if(Objects.equals(password, enteredPassword)){
            if(money > balance){
                return "No kasu";
            }
            else {
                return "Enjoy";
            }
        }
        else {
            return "Wrong password.....";
        }
    }

    @Override
    public double CalculateInterest(int years) {
        return (balance * years * rateOfInterest) / 100;
    }
}
