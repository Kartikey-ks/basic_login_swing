import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class facebook {
    public static void main(String[] args) {

        JFrame f1 = new JFrame();
        JLabel l1 = new JLabel("Username");
        JLabel l2 = new JLabel("Password");
        JLabel l3 = new JLabel();
        JLabel l4 = new JLabel("facebook");
        JTextField tf1 = new JTextField(60);
        JButton b1 = new JButton("Login");
        JPasswordField pass = new JPasswordField();
        ImageIcon icon = new ImageIcon("facebook-icon.png");

        f1.setBounds(480, 200, 600, 500);
        f1.setVisible(true);
        // f1.setLayout(null);

        f1.setResizable(true);
        f1.setTitle("Facebook");
        f1.setIconImage(icon.getImage());

        Color bg = new Color(66, 103, 178);
        f1.getContentPane().setBackground(bg);

        l1.setBounds(150, 200, 120, 30);
        l2.setBounds(150, 250, 120, 30);
        l3.setBounds(210, 340, 120, 30);
        l3.setFont(new Font("Arial", Font.PLAIN, 24));
        l4.setBounds(190, 115, 200, 50);
        l4.setFont(new Font("Arial", Font.PLAIN, 40));
        l4.setForeground(Color.WHITE);
        tf1.setBounds(250, 200, 120, 30);
        pass.setBounds(250, 250, 120, 30);

        b1.setBounds(230, 300, 80, 30);

        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(tf1);
        f1.add(pass);
        f1.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent temp) {
                if (tf1.getText().toString().equals("kartikey") && pass.getText().toString().equals("password")) {

                    showWelcomePopup();
                } else
                    showInvalidPasswordPopup();
            }
        });

    }

    private static void showWelcomePopup() {
        JOptionPane.showMessageDialog(null, "Welcome! You have entered the correct password.", "Welcome",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void showInvalidPasswordPopup() {
        JOptionPane.showMessageDialog(null, "Invalid Username or Password. Please try again.", "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}
