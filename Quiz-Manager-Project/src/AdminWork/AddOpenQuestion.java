package AdminWork;

import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddOpenQuestion extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField question;
	private JTextField hint;
	private JButton btnNewButton;
	
//    public static void main(String[] args) {
      public static void crud() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddOpenQuestion frame = new AddOpenQuestion();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddOpenQuestion() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 250, 1100, 700);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Add New Question");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel quest = new JLabel("Question:");
        quest.setFont(new Font("Tahoma", Font.PLAIN, 20));
        quest.setBounds(58, 152, 99, 43);
        contentPane.add(quest);

        JLabel opt1 = new JLabel("Hint: ");
        opt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        opt1.setBounds(58, 243, 110, 29);
        contentPane.add(opt1);

        question = new JTextField();
        question.setFont(new Font("Tahoma", Font.PLAIN, 32));
        question.setBounds(214, 151, 500, 50);
        contentPane.add(question);
        question.setColumns(10);

        hint = new JTextField();
        hint.setFont(new Font("Tahoma", Font.PLAIN, 32));
        hint.setBounds(214, 235, 500, 50);
        contentPane.add(hint);
        hint.setColumns(10);
        

        
        
        
        btnNewButton = new JButton("Add Question");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ques = question.getText();
                String hinnt = hint.getText();
                String msg = "" + ques;
                msg += " \n";
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
                    String query = "INSERT INTO public.\"openQuestion\"(question, hint)VALUES ('"+ques+"', '"+hinnt+"');";
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
        btnNewButton.setBounds(399, 475, 225, 50);
        contentPane.add(btnNewButton);    
        }
}

