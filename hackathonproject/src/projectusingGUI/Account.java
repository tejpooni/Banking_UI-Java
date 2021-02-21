package projectusingGUI;

import java.util.ArrayList;
import java.util.Random;

public abstract class Account {
    //data members common across all accounts
    private int id_number; //4 digit ID numbers
    private int balance = 10000;

    //methods

    Random rand = new Random();
    // Generate random integers in range 0 to 999
    int rand_int1 = rand.nextInt(100000);


    //constructor opening a new account creation of this object is instantiation
    public Account() {
        id_number = rand_int1;
    }

    //getter/setters for ID # and bank balance
    public int getId_number() { //
        return id_number;
    }

    public void setId_number(int id_number) {//creation of a new bank ID or account
        this.id_number = id_number;
    }

    public int getBalance() {//view balance
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int deposit(int amount){
        this.balance = balance+amount;
        return balance;
    }

    public int withdraw(int amount){
        int money_out = balance - amount;
        this.balance = money_out;
        return balance;
    }

    public void account_summary(){
        //display balance, ID number, transaction history perhaps?
        //for transaction history we can update balance values in an arraylist and iterate through to show history
        System.out.println(this.balance);
        System.out.println(this.id_number);
        System.out.println("Transaction History...");


    }
}
