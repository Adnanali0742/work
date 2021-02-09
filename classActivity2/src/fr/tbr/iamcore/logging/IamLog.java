package fr.tbr.iamcore.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IamLog {
	
	public static final String INFO = "INFO --";
	public static final String WARN = "WARN --";
	public static final String DEBUG = "DEBUG --";
	public static final String ERROR = "ERROR --";
	
	public enum Level{
		INFO,
		WARN,
		DEBUG,
		ERROR
	}

	public void log(String message, Level level) {}
	
	static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss.SSS");
	private String loggingEntity;
	private PrintWriter writer;


	public IamLog(String loggingEntity) {
		File loggingFile = new File("G:\\java\\file.txt");
		if (!loggingFile.exists()){
		    try{
				loggingFile.createNewFile();
			}catch(IOException ioe){
				System.out.println("An error occurred while preparing the log file");
			}
		}
		try {
			this.writer = new PrintWriter(new FileWriter(loggingFile));
//			writer.println("Created an IamLog instance, beginning of the log file");
			writer.flush();
		} catch (IOException e) {
		}
		this.loggingEntity = loggingEntity;
	}


	public void log(String message, String level) {
	    String trace = sdf.format(new Date()) + " " + loggingEntity + " - ["	+ level + "] - " + message;
	    this.writer.println(trace);
	    writer.flush();

	}

	public void info(String message) {
		log(message, "INFO");
	}

	public void warn(String message) {
		log(message, "WARN");
	}


	public void error(String message) {
		log(message, "ERROR");
	}


	public void debug(String message) {
		log(message, "DEBUG");
	}

}