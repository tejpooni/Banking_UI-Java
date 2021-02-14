package Hackathon;

import java.util.Random;
import java.util.Scanner;


public class Chequing extends Account{
    //data members ID and balance but we need to initialize a pin so we can enter the account
    private int code = 1234;


    //method to prompt user input for correct code so they can access account
    public static void access(int pin){
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your pin:");

        int processed_input = input.nextInt();  // Read user input code
        if(processed_input == pin){// if its a match then they can access acount
            System.out.println("Access Granted");  // Output user input
            //everything is done here: 3 actions deposit/withdraw/check balance:

        }
    }


}
