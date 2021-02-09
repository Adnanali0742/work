package JDBS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_select_dataJDBC {

	public static void main(String args[]) throws SQLException {
		//		search(null);
		create();
	}

	//	this function will print all the data from the table of database:

	//	public static void search(dataModel quest) throws SQLException {
	//		
	//		Connection connection = null;
	//		try {
	//			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		}
	//		
	//		String query = "SELECT id, question, opt1, opt2, opt3, opt4, ans\r\n"
	//				+ "	FROM public.\"Linux\";";
	//		PreparedStatement prepareStatement = connection.prepareStatement(query);
	//		ResultSet results = prepareStatement.executeQuery();
	//		while (results.next()) {
	//			String question = results.getString("Question");
	//			String opt1 = results.getString("opt1");
	//			String opt2 = results.getString("opt2");
	//			String opt3 = results.getString("opt3");
	//			String opt4 = results.getString("opt4");
	//			
	//			System.out.println("question : " + question + " \na : " + opt1 + " \nb : " + opt2
	//					 + " \nc : " + opt3 + " \nd : " + opt4 );
	//			 
	//		}
	//		connection.close();
	//	}


	//	for insertion into database tables and aftere insertion complete it will show all data
	//	
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

//			String sql = "INSERT INTO public.\"QUESTIONS\"(question, difficulty)VALUES (?, ?);";
			
			String sql = "INSERT INTO lass.\"QUESTIONS\"(question, difficulty)VALUES (?, ?);";
			

			myStmt = myConn.prepareStatement(sql);

			// set param values to the database according to my queeye
			myStmt.setString(1, quest);
			myStmt.setInt(2, diffi);

			// 3. Execute SQL query
			myStmt.executeUpdate();

			System.out.println("Insert has been complete.");
			search(null);
		} catch (Exception exc) {
			exc.printStackTrace();
		} 
	}
	
	
	
		public static void search(dataModedl2 quest) throws SQLException {
			
			Connection connection = null;
			try {
				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
//			String query = "SELECT id, question, opt1, opt2, opt3, opt4, ans\r\n"
//					+ "	FROM public.\"Linux\";";
			
			String query = "SELECT question, difficulty FROM lass.\"QUESTIONS\"" + " where difficulty = 4;";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			ResultSet results = prepareStatement.executeQuery();
			while (results.next()) {
				String question = results.getString("Question");
				int opt1 = results.getInt("difficulty");				
				System.out.println("question : " + question + " \naDifficulty : " + opt1 );
				 
			}
			connection.close();
		}

	
	
	
	
}