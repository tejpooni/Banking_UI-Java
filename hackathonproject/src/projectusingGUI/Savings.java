package projectusingGUI;

import java.util.Scanner;

public class Savings extends Account {
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
