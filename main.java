import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

abstract class Account {
    //data members common across all accounts
    protected int id_number; //4 digit ID numbers
    protected int balance;
    protected Random rand = new Random();
    // Generate random integers in range 0 to 999
    protected int rand_int1 = rand.nextInt(1000);
	
	protected ArrayList<Summary> summaryList = new ArrayList<Summary>();
	
	protected enum Action
	{
		DEPOSIT, WITHDRAW
	}
	
	protected class Summary
	{
		Action action;
		int number;
		
		Summary(Action action, int number)
		{
			this.action = action;
			this.number = number;
		}
	}
	
    //methods

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

    public  int getBalance() {//view balance
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int deposit(int amount){
        this.balance = balance + amount;
		
		summaryList.add(new Summary(Action.DEPOSIT, amount));
        return balance;
    }

    public int withdraw(int amount){
        int money_out = balance - amount;
        this.balance = money_out;
		
		summaryList.add(new Summary(Action.WITHDRAW, amount));
        return balance;
    }

    public void account_summary(){
        //display balance, ID number, transaction history perhaps?
        //for transaction history we can update balance values in an arraylist and iterate through to show history
        System.out.println(this.balance);
        System.out.println(this.id_number);
		this.withdraw(100);
		this.deposit(200);
        System.out.println("Transaction History...");
		for (Summary i : summaryList)
		{
			System.out.println(i.action + ": " + i.number);
		}
    }
}

class Chequing extends Account{
    //data members ID and balance but we need to initialize a pin so we can enter the account
    private int code = 1234;


    //method to prompt user input for correct code so they can access account
    public void access(int pin){
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your pin:");

        int processed_input = input.nextInt();  // Read user input code
        if(processed_input == pin){// if its a match then they can access acount
            System.out.println(balance);  // Output user input
            //everything is done here: 3 actions deposit/withdraw/check balance:
        }
    }
}


class Savings extends Account {
    private double interest_rate;
    private int balance = getBalance();
    private int pin = 123;

    public Savings(){
        this.interest_rate = 1.2;
    }

    public double getInterest_rate(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your pin:");

        int processed_input = input.nextInt();  // Read user input code
        if(processed_input == pin){// if its a match then they can access acount
            System.out.println("Access Granted");  // Output user input
            //everything is done here: 3 actions deposit/withdraw/check balance:

            if(balance > 1000000){
                interest_rate = 0.5;
                return interest_rate;
            }else if(balance > 100000 ){
                interest_rate = 0.8;
                return interest_rate;
            }else if(balance > 10000){
                interest_rate = 1;
                return  interest_rate;
            }else if(balance > 1000){
                interest_rate = 1.5;
                return  interest_rate;
            }else{
                interest_rate = 0;
                System.out.println("You do not qualify for any interest");
                return  interest_rate;
            }
        }
        System.out.println("Incorrect PIN");
        interest_rate = 0;
        return interest_rate;
    }


}


public class main {

    public static void main(String[] args){
        System.out.println();

        Account chequing1 = new Chequing();
        int bal = chequing1.getBalance();
		
        System.out.println(bal);
		chequing1.account_summary();
    }
}