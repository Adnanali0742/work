package postgreSQLDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class connection {

	public static void main(String[] args) {
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
		System.out.println(connection.getSchema());
		String query = "select question,difficulty from \"QUESTIONS\"";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet results = prepareStatement.executeQuery();
		while (results.next()) {
			String question = results.getString("question");
			int difficulty = results.getInt("difficulty");
			System.out.println("question : " + question + " with difficulty :" + difficulty);
		}
		
		connection.close();

	}

}
