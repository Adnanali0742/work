package logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IamLog {

	private static PrintWriter writer;

	private static boolean initialized = false;

	public static void logMessage(String message) {
	 System.out.println(message);	
	}
	public static void logFileMessage(String message) {
		if (!initialized) {
			try {
				writer = new PrintWriter(new FileWriter(new File("G:\\java\\file.txt"), true));
			}catch(IOException e) {
				System.out.println("error while initializing logging file");
				e.printStackTrace();
				writer = new PrintWriter(System.out);
			}
			initialized = true;
		}
		Date date = new Date();
		String format = "yyyy-MM-dd_HH:mm:ss,SSS";

		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		writer.println(dateFormat.format(date) + " " + message);
		writer.flush();
	}

}