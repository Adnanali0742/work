package mcqs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


import datamodels.Pointclass;

public class python {
	public static void searchFromPython() throws SQLException {
		System.out.print("Enter you name please: ");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();
		
		create(name);
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String query = "SELECT id, question, opt1, opt2, opt3, opt4, ans\r\n"
				+ "	FROM public.\"Python\";";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet results = prepareStatement.executeQuery();
		int count = 0;
		while (results.next()) {
//			int id = results.getInt("id");
			String question = results.getString("Question");
			String opt1 = results.getString("opt1");
			String opt2 = results.getString("opt2");
			String opt3 = results.getString("opt3");
			String opt4 = results.getString("opt4");
//			String answ = results.getString("ans");
			
			System.out.println("question : " + question + " \na : " + opt1 + " \nb : " + opt2
					 + " \nc : " + opt3 + " \nd : " + opt4 );
			System.out.println("Please select your choice: (a/b/c/d)");
			Scanner sc = new Scanner(System.in);
			String ch = sc.next();
			String answ = results.getString("ans");
			
			 if(ch.equals(answ)){ 
		           
					String url = "jdbc:postgresql://localhost:5432/2020s1-quiz-database";
					String user = "postgres";
					String password = "";

					Connection myConn = null;
					PreparedStatement myStmt = null;
					Scanner scanner = null;
					try {
						scanner = new Scanner(System.in);
						myConn = DriverManager.getConnection(url, user, password);												
						count++;
						String sql = "UPDATE public.students SET points='" + count +"' WHERE name= '" + name +"'";
						myStmt = myConn.prepareStatement(sql);
						myStmt.executeUpdate();
					} catch (Exception exc) {
						exc.printStackTrace();
						}
		        }else {
		        	System.out.println("eror");
		        }
			 
			 
		}
		score(null, name);
		connection.close();
	}
		
	public static void create(String name) {
		String url = "jdbc:postgresql://localhost:5432/2020s1-quiz-database";
		String user = "postgres";
		String password = "";

		Connection myConn = null;
		PreparedStatement myStmt = null;

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			myConn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO public.students(name)VALUES (?);";
			myStmt = myConn.prepareStatement(sql);
			myStmt.setString(1, name);
			myStmt.executeUpdate();
			System.out.println("Insert has been complete.");
		} catch (Exception exc) {
			exc.printStackTrace();
			} 
		}
	
	public static void score(Pointclass poi, String name) throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String query = "SELECT points FROM public.students where name = '" + name + "'";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet results = prepareStatement.executeQuery();
		while (results.next()) {
			String score = results.getString("points");
			
			System.out.println("You Got "+ score + " Points " + name + ".");

	}}
}
