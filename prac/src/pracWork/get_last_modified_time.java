package pracWork;

import java.io.File;
import java.util.Date;

public class get_last_modified_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("G:\\java\\file.txt");
		Date date = new Date(file.lastModified());
		System.out.println("'nThe file is last modified on: " + date + "'n");

	}

}
