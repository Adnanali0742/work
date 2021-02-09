package CommQuestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


import datamodels.openQues;


public class openQuestions {
	public static void openQuestion() throws SQLException{
		search(null);
	}
	
	public static void search(openQues quest) throws SQLException {		
		System.out.print("Enter you name please: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		create(name);
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String query = "SELECT id, question, hint FROM public.\"openQuestion\";";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet results = prepareStatement.executeQuery();
		while (results.next()) {
			int id = results.getInt("id");
			String question = results.getString("Question");
			String hint = results.getString("hint");

			
			System.out.println("question no: " + id + " - "+ question + " \nHint: " + hint);
			
			String url = "jdbc:postgresql://localhost:5432/2020s1-quiz-database";
			String user = "postgres";
			String password = "";

		
			Connection myConn = null;
			PreparedStatement myStmt = null;
			Scanner scanner = null;
			try {
				scanner = new Scanner(System.in);
				myConn = DriverManager.getConnection(url, user, password);	
				System.out.println("Answer here: ");
				String ans1 = sc.next();
				String sql = "UPDATE public.students SET points='" + ans1 +"' WHERE name= '" + name +"'";
				myStmt = myConn.prepareStatement(sql);
				myStmt.executeUpdate();
					} catch (Exception exc) {
						exc.printStackTrace();
						}			 			
		    		        
		    }
						 
		


		connection.close();
	}
		
	public static void create(String name) {
		String url = "jdbc:postgresql://localhost:5432/2020s1-quiz-database";
		String user = "postgres";
		String password = "";

		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			myConn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO public.students(name)VALUES (?);";
			myStmt = myConn.prepareStatement(sql);
			myStmt.setString(1, name);
			myStmt.executeUpdate();

		} catch (Exception exc) {
			exc.printStackTrace();
			} 
		}
	


	
}

