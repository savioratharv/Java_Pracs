import java.util.*;

class Account{
    String name;
    String acc_no;
    double balance;
    public Account(String name, String acc_no, double balance){
        this.acc_no=acc_no;
        this.name=name;
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Cannot Withdraw given amount, balance too low");
        }
        else{
            balance=balance-amount;
            System.out.println(amount+" withdrawn from your bank account");
            System.out.println("New Balance: "+balance);
        }
    }
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println(amount+" deposited in your bank account");
        System.out.println("New Balance: "+balance);
    }
}

class SavingsAccount extends Account{
    double interest;
    public SavingsAccount(String name, String acc_no, double balance, double interest) {
        super(name,acc_no,balance);
        this.interest=interest;
    }

    public void addInterest(){
        balance=balance+interest*balance;
        System.out.println("Interest of "+(interest*balance)+" deposited");
        System.out.println("New Balance: "+getBalance());
    }
    
    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Cannot Withdraw given amount, balance too low");
        }
        else{
            balance=balance-amount;
            System.out.println(amount+" withdrawn from your bank account");
            System.out.println("New Balance: "+balance);
        }
    }

    @Override
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println(amount+" deposited in your bank account");
        System.out.println("New Balance: "+balance);
    }

}

class CurrentAccount extends Account{
    int odlimit;
    public CurrentAccount(String name, String acc_no, double balance, int odlimit) {
        super(name,acc_no,balance);
        this.odlimit=odlimit;
    }
    
    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public void withdraw(double amount){
        if(amount>odlimit){
            System.out.println("OverDraft Limit exceeded, cannot proceed transaction");
        }
        else{
            balance=balance-amount;
            System.out.println(amount+" withdrawn from your bank account");
            System.out.println("New Balance: "+balance);
        }
    }

    @Override
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println(amount+" deposited in your bank account");
        System.out.println("New Balance: "+balance);
    }

}

public class Bank {
    public static void main(String[] args) {
        CurrentAccount acc1 = new CurrentAccount("A", "x", 5000, 2000);
        SavingsAccount acc2 = new SavingsAccount("B", "y", 8000, 0.05);
        acc1.withdraw(1000);
        acc1.getBalance();
        acc2.addInterest();
        acc2.getBalance();
        }
}
