package Launcher;

import static AdminWork.AdminLogin.login;
import static CommQuestion.withdifficulty.studentcomm;
import static CommQuestion.openQuestions.openQuestion;
import static logger.IamLog.logMessage;
import static mcqs.Java.student;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import datamodels.Questions;
import Database.connection;
public class mainLauncher {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		launcherMenu();
		}

//	public static void main(String[] args) throws SQLException {
	public static void launcherMenu() throws SQLException {
		
		
		System.out.println("Welcome to quiz management system \nselect your choice please: \n- 1 - I AM ADMIN. \n- 2 - I AM A STUDENT.");
//		Questions question = new Questions();
		Scanner sc = new Scanner(System.in);
		int person = sc.nextInt();
//		System.out.println("Welcomme Mr. "+ person);	
//		System.out.print("Tell what difficulty level you choose for quiz: ");  
//		int diffi= sc.nextInt();  		
//		question.setDifficulty(diffi);
		
//		connection conn = new connection();
	    //conn.search(question);
	    //conn.create();
		//create();
		
		switch(person) {
		case 1:
			login();
			break;
		case 2:
			System.out.println("Please select type of quiz: \n- 1 - Multiple Choice Quiestions. \n- 2 - Common Questions. \n- 3 - Open Questions.");
			int type = sc.nextInt();
			switch(type) {
			case 1:
				student();
				break;
			case 2:
				studentcomm();
				break;
			case 3:
				openQuestion();
				break;
			}
			break;
		}}}
