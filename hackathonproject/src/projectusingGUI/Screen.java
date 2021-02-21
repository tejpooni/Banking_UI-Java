package projectusingGUI;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends Chequing {
    int width = 900;
    int height = 600;
    String userinfo1;
    String accountType[] = {"Chequing", "Saving"};

    //Boolean isMatch = false;

    private JFrame frame1 = new JFrame("Screen 1");
    private JFrame frame2 = new JFrame("Screen 2");
    private JFrame frame3 = new JFrame("Screen 3");

    private JButton button1 = new JButton("Go to second screen");
    private JButton button2 = new JButton("Go to third screen");
    private JButton button3 = new JButton("Exit");
    private JButton btnEnteredPIn= new JButton("Enter");

    private JMenuBar menuBar1 = new JMenuBar();
    private JMenuBar menuBar2 = new JMenuBar();
    private JMenuBar menuBar3 = new JMenuBar();

    private JTextField textField = new JTextField(10);
    //private JPasswordField userPin = new JPasswordField();

    private JLabel enterPinText = new JLabel();
    private JLabel printBalance = new JLabel();
    private JLabel printID = new JLabel();
    private JLabel printaccountType = new JLabel();

    private JComboBox accountdropdown = new JComboBox(accountType);


    public Screen(){
        getScreen1();
    }


    public void getScreen1() {
        JMenu m1 = new JMenu("Test1");
        JMenu m2 = new JMenu("Test2");
        JMenuItem mi1 = new JMenuItem("FIRST");
        JMenuItem mi2 = new JMenuItem("FIRST");

        menuBar1.add(m1);
        menuBar1.add(m2);
        m1.add(mi1);
        m2.add(mi2);

        enterPinText.setText("Enter Pin");
        enterPinText.setBounds(380, 195, 195, 90);

        textField.setEditable(true);
        userinfo1 = textField.getText();

        textField.setBounds(350, 250, 130, 20);
        //userPin.setBounds(350, 250, 130, 20);

        button1.setBounds(300, 400, 195, 30);
        btnEnteredPIn.setBounds(490, 250, 130, 40);

        frame1.add(button1);
        frame1.add(btnEnteredPIn);
        frame1.add(menuBar1);
        frame1.add(textField);
        frame1.add(enterPinText);
        frame1.setSize(width, height);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //userinfo1 = userPin.getText();

        btnEnteredPIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(userinfo1);
                //isMatch = access(userinfo1);

                getScreen2();

                System.out.println("Incorrect Pin");

            }
        });


//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                getScreen2();
//                System.out.println(userinfo1);
//            }
//        });
    }

        public void getScreen2(){
            int bal = getBalance();

            JMenu m3 = new JMenu("Test1");
            JMenu m4 = new JMenu("Test2");
            JMenuItem mi12 = new JMenuItem("FIRST");
            JMenuItem mi22 = new JMenuItem("FIRST1");

            menuBar2.add(m3);
            menuBar2.add(m4);
            m3.add(mi12);
            m4.add(mi22);

            printBalance.setText("Balance: " + bal + "BTC");
            printBalance.setBounds(180, 200, 195, 90);

            printID.setText("ID: 184749");
            printID.setBounds(180, 300, 195, 90);

            printaccountType.setText("Account Type: ");
            printaccountType.setBounds(380, 195, 195, 90);

            button2.setBounds(400, 500, 195, 30);

            accountdropdown.setSelectedIndex(1);
            accountdropdown.setBounds(380, 295, 195, 90);

            frame2.add(printBalance);
            frame2.add(printID);
            frame2.add(printaccountType);
            frame2.add(button2);
            frame2.add(accountdropdown);
            frame2.setSize(width, height);
            frame2.setLayout(null);
            frame2.setVisible(true);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setVisible(false);



            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getScreen3();
                }
            });

         }


    public void getScreen3(){
        JMenu m5 = new JMenu("Test1");
        JMenu m6 = new JMenu("Test2");
        JMenuItem mi13 = new JMenuItem("FIRST");
        JMenuItem mi23 = new JMenuItem("FIRST");

        menuBar3.add(m5);
        menuBar3.add(m6);
        m5.add(mi13);
        m6.add(mi23);

        button3.setBounds(400, 300, 95, 30);
        frame3.add(button3);
        frame3.setSize(width, height);
        frame3.setLayout(null);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(false);

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.dispose();
            }
        });

    }

}




