package pracWork;

import java.io.File;
import java.io.IOException;

public class create_empty_new_file {
	
    private static final String SAMPLE_CSV_FILE_PATH = "G:\\java\\fileMe3.csv";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(SAMPLE_CSV_FILE_PATH);
		
		//create the file 
		if(file.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("file already exist");
		}

	}

}
