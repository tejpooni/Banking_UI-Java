package projectusingGUI;

import javax.swing.*;
import java.util.*;

public class Main {

//    public static void createScreen(){
//        JFrame frame1 = new JFrame("GUI SCREEN");
//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame1.setSize(700,600);
//        JButton button1 = new JButton("Press");
//        frame1.getContentPane().add(button1); // Adds Button to content pane of frame
//        frame1.setVisible(true);
//    }
//    public static String pin = "1234";
//
//    private int code = 1234;
//
//    //method to prompt user input for correct code so they can access account
//    public static void access(){
//        System.out.println("Enter your pin:");
//        Scanner input = new Scanner(System.in);  // Create a Scanner object
//
//        int processed_input = input.nextInt();  // Read user input code
//        if(processed_input == pin){// if its a match then they can access account
//            System.out.println("Access Granted");  // Output user input
//            //everything is done here: 3 actions deposit/withdraw/check balance:
//
//        }else{
//            System.out.println("Access Denied");
//        }
//    }

    public static void main(String args[]){
        Screen screen1 = new Screen();

        //screen1.pin = pin;

        //Account chequing1 = new Chequing();
       // int bal = chequing1.getBalance();

        //System.out.println(bal);

        //access();

    }
}
