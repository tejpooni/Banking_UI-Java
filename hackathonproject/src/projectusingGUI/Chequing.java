package projectusingGUI;

import java.util.Random;
import java.util.Scanner;


public class Chequing extends Account{
    //data members ID and balance but we need to initialize a pin so we can enter the account
    private static String pin = "1234";


    //method to prompt user input for correct code so they can access account
    public static Boolean access(String processed_input){
        System.out.println("Enter your pin:" + processed_input + "!");
        //Scanner input = new Scanner(System.in);  // Create a Scanner object

        //int processed_input = input.nextInt();  // Read user input code
        if(processed_input.equals(pin)){// if its a match then they can access account
            System.out.println("Access Granted");  // Output user input
            //everything is done here: 3 actions deposit/withdraw/check balance:
            return true;

        }else{
            System.out.println("Access Denied");
            return false;
        }
    }
}
