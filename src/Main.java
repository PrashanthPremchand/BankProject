import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String userName;
        double balance;
        String password;
        Scanner sc = new Scanner(System.in);
        //create user
        System.out.println("Enter your user name, balance and password to create an account");
        userName = sc.next();
        balance = sc.nextDouble();
        password = sc.next();
        SBIUser user1 = new SBIUser(userName, password, balance);
        System.out.println("Select the transaction.\n1. Check balance\n2. Add amount\n3. Withdraw\n4. Calculate interest");
        int choice = sc.nextInt();
        if( choice == 1){
            //check balance
            System.out.println(user1.CheckBalance());
        }
        else if(choice == 2){
            //add amount
            System.out.println("Enter the amount you want to add");
            double amount = sc.nextDouble();
            System.out.println(user1.AddMoney(amount));
        }
        else if(choice == 3){
            //withdraw
            System.out.println("Enter the the amount to been withdrawn and the password");
            double amount = sc.nextDouble();
            String enteredPassword = sc.next();
            System.out.println(user1.WithdrawMoney(amount, enteredPassword));
        }
        else{
            //calculate interest
            System.out.println("Entre the number of years you want to calculate interest for.");
            int years = sc.nextInt();
            System.out.println(user1.CalculateInterest(years));
        }

    }
}