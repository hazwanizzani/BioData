import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumberIn, double balanceIn, String ownerNameIn){
        this.accountNumber = accountNumberIn;
        this.balance = balanceIn;
        this.ownerName = ownerNameIn;
    }

    public void deposit(double depAmount){
        if (depAmount > 0){
            balance += depAmount;
            System.out.println("Amount " + depAmount + " is successfully deposited");
            System.out.println("Balance is  " + balance + " ");
        }
        else{
            System.out.println("Cannot deposit less than 0");
        }
    }

    public void withdraw(double withAmount){
        if (withAmount > 0 && withAmount <=balance){
            balance -= withAmount;
            System.out.println("Amount " + withAmount + " is successfully withdrawn");
            System.out.println("Balance is  " + balance + " ");
        }
        else if (withAmount< 0){
            System.out.println("Invalid amount to withdraw");
        }
        else if (withAmount> balance){
            System.out.println("Cannot withdraw less than balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void getBalance() {
        System.out.println("Account Balance: " + balance);
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void displayAccountInfo() {
        System.out.println("Account number: " + accountNumber + " for user: " + ownerName + " has : RM" + balance  + " in balance.");
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("0000000001",2500, "Hazwan Izzani");
        account.displayAccountInfo();


        Scanner myObj = new Scanner(System.in);

        System.out.println("Would you like to withdraw (w) or deposit (d)?");
        String choice = myObj.nextLine().toLowerCase();
        if (choice.charAt(0) == 'w') {
            System.out.println("How much would you like to withdraw? ");
            double withAmount = myObj.nextDouble();
            account.withdraw(withAmount);
        }
        else if (choice.charAt(0) == 'd') {
            System.out.println("How much would you like to deposit? ");
            double depAmount = myObj.nextDouble();
            account.deposit(depAmount);
        }
        else{
            System.out.println("Invalid command.");
        }

        myObj.close();

    }
}
