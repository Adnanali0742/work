package AdminWork;

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

public class AdminJAddMcq extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField question;
	private JTextField option1;
	private JTextField option2;
	private JTextField option3;
	private JTextField option4;
	private JTextField correctans;
	private JButton btnNewButton;
	private JButton btnNewButton1;
	private JButton btnNewButton2;
	
//    public static void main(String[] args) {
      public static void crud() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminJAddMcq frame = new AdminJAddMcq();
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

    public AdminJAddMcq() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 250, 1100, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Add New Question");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel quest = new JLabel("Question");
        quest.setFont(new Font("Tahoma", Font.PLAIN, 20));
        quest.setBounds(58, 152, 99, 43);
        contentPane.add(quest);

        JLabel opt1 = new JLabel("Option - a : ");
        opt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt1.setBounds(58, 243, 110, 29);
        contentPane.add(opt1);

        JLabel opt2 = new JLabel("Option - b : ");
        opt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt2.setBounds(58, 324, 124, 36);
        contentPane.add(opt2);

        question = new JTextField();
        question.setFont(new Font("Tahoma", Font.PLAIN, 32));
        question.setBounds(214, 151, 228, 50);
        contentPane.add(question);
        question.setColumns(10);

        option1 = new JTextField();
        option1.setFont(new Font("Tahoma", Font.PLAIN, 32));
        option1.setBounds(214, 235, 228, 50);
        contentPane.add(option1);
        option1.setColumns(10);
        
        option2 = new JTextField();
        option2.setFont(new Font("Tahoma", Font.PLAIN, 32));
        option2.setBounds(214, 320, 228, 50);
        contentPane.add(option2);
        option2.setColumns(10);

        option3 = new JTextField();
        option3.setFont(new Font("Tahoma", Font.PLAIN, 32));
        option3.setBounds(707, 151, 228, 50);
        contentPane.add(option3);
        option3.setColumns(10);

        JLabel opt3 = new JLabel("Option - c : ");
        opt3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt3.setBounds(542, 159, 224, 36);
        contentPane.add(opt3);

        JLabel opt4 = new JLabel("Option - d :");
        opt4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt4.setBounds(542, 245, 224, 36);
        contentPane.add(opt4);

        JLabel ans = new JLabel("Correct (a/b/c/d) : ");
        ans.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ans.setBounds(542, 329, 224, 36);
        contentPane.add(ans);

        correctans = new JTextField();
        correctans.setFont(new Font("Tahoma", Font.PLAIN, 32));
        correctans.setBounds(707, 320, 228, 50);
        contentPane.add(correctans);
        correctans.setColumns(10);

        option4 = new JTextField();
        option4.setFont(new Font("Tahoma", Font.PLAIN, 32));
        option4.setBounds(707, 235, 228, 50);
        contentPane.add(option4);
        
        btnNewButton = new JButton("Add in Java");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ques = question.getText();
                String op1 = option1.getText();
                String op2 = option2.getText();
                String op3 = option3.getText();
                String op4 = option4.getText();
                String corrans = correctans.getText();

                String msg = "" + ques;
                msg += " \n";
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
                    String query = "INSERT INTO public.\"Java\"(question, opt1, opt2, opt3, opt4, ans)VALUES ('" + ques +"', '" + op1 + "', '" + op2 + "', '" + op3 + "', '" + op4 + "', '" + corrans + "');";
    
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            msg + "is successfully added to Java topic");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 225, 50);
        contentPane.add(btnNewButton);
        
        
        //add question to python topic
        
        btnNewButton1 = new JButton("Add in Python");
        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ques = question.getText();
                String op1 = option1.getText();
                String op2 = option2.getText();
                String op3 = option3.getText();
                String op4 = option4.getText();
                String corrans = correctans.getText();

                String msg = "" + ques;
                msg += " \n";
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
                    String query = "INSERT INTO public.\"Python\"(question, opt1, opt2, opt3, opt4, ans)VALUES ('" + ques +"', '" + op1 + "', '" + op2 + "', '" + op3 + "', '" + op4 + "', '" + corrans + "');";
    
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton1, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton1,
                            msg + "is successfully added to Python topic");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton1.setBounds(99, 447, 225, 50);
        contentPane.add(btnNewButton1);

        
        
        
        
        //add question to linux topic
        
        btnNewButton2 = new JButton("Add in Linux");
        btnNewButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ques = question.getText();
                String op1 = option1.getText();
                String op2 = option2.getText();
                String op3 = option3.getText();
                String op4 = option4.getText();
                String corrans = correctans.getText();

                String msg = "" + ques;
                msg += " \n";
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
                    String query = "INSERT INTO public.\"Linux\"(question, opt1, opt2, opt3, opt4, ans)VALUES ('" + ques +"', '" + op1 + "', '" + op2 + "', '" + op3 + "', '" + op4 + "', '" + corrans + "');";
    
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton2, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton2,
                            msg + "is successfully added to Linux topic");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton2.setBounds(700, 447, 225, 50);
        contentPane.add(btnNewButton2);       
    }
}
