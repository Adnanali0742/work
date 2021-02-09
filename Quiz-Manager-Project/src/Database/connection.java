package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import datamodels.Questions;


public class connection {
	
//	fro searching
	
	public static void search(Questions quest) throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "select question,difficulty from \"QUESTIONS\" where difficulty = ?";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		prepareStatement.setLong(1, quest.getDifficulty());
		ResultSet results = prepareStatement.executeQuery();
		while (results.next()) {
			String question = results.getString("question");
			int difficulty = results.getInt("difficulty");
			System.out.println("question : " + question + " with difficulty : " + difficulty);
		}
		connection.close();
	}
	
	
//	for insertion into database
	
	public static void create() {
		String url = "jdbc:postgresql://localhost:5432/2020s1-quiz-database";
		String user = "postgres";
		String password = "";

		Connection myConn = null;
		PreparedStatement myStmt = null;

		Scanner scanner = null;

		try {
			//read user input from command line: Question, and its difficulty level
			scanner = new Scanner(System.in);

			System.out.print("Type the Question here: ");
			String quest = scanner.nextLine();

			System.out.print("Type the diffiulty level here: ");
			int diffi = scanner.nextInt();
			myConn = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO public.\"QUESTIONS\"(question, difficulty)VALUES (?, ?);";

			myStmt = myConn.prepareStatement(sql);

			// set param values to the database according to my queeye
			myStmt.setString(1, quest);
			myStmt.setInt(2, diffi);

			// 3. Execute SQL query
			myStmt.executeUpdate();

			System.out.println("Insert has been complete.");
		} catch (Exception exc) {
			exc.printStackTrace();
			} 
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}