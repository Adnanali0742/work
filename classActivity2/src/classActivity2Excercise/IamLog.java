package classActivity2Excercise;

import java.util.Date;
import java.text.SimpleDateFormat;

public class IamLog {
	
	
	public static void log(String msg) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss.SSS");
		String stringResult = simpleDateFormat.format(date);
		System.out.println(stringResult + " : " +msg);
	}

	public static void main(String[] args) {
		
		String s = "Beginning of the program";
		log(s);

	}

}
