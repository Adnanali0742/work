package AdminWork;

import java.util.Scanner;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminActions extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton btnNewButton1;
    private JButton btnNewButton2;
    private JLabel label;
    private JLabel label1;
    private JLabel label2;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void login() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminActions frame = new AdminActions();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public AdminActions() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Please select your action");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(225, 52, 700, 50);
        contentPane.add(lblNewLabel);


        
        btnNewButton = new JButton("MCQ's Questions");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(58, 152, 250, 50);
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                        dispose();
//                        UserHome ah = new UserHome(userName);
                        AdminJAddMcq ah = new AdminJAddMcq();
                        ah.setTitle("Welcome");
                        ah.setVisible(true);
            }
        });

        contentPane.add(btnNewButton);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
        
        
        
        btnNewButton1 = new JButton("Common Questions");
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton1.setBounds(325, 152, 300, 50);
        btnNewButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                        dispose();
//                        UserHome ah = new UserHome(userName);
                        AdminAddCommon ah = new AdminAddCommon();
                        ah.setTitle("Welcome");
                        ah.setVisible(true);
            }
        });

        contentPane.add(btnNewButton1);

        label1 = new JLabel("");
        label1.setBounds(0, 0, 1008, 562);
        contentPane.add(label1);

        
        
        
        btnNewButton2 = new JButton("Add Open Question");
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton2.setBounds(640, 152, 300, 50);
        btnNewButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                        dispose();
//                        UserHome ah = new UserHome(userName);
                        AddOpenQuestion ah = new AddOpenQuestion();
                        ah.setTitle("Welcome");
                        ah.setVisible(true);
            }
        });

        contentPane.add(btnNewButton2);

        label2 = new JLabel("");
        label2.setBounds(0, 0, 1008, 562);
        contentPane.add(label2);

        
    }
}