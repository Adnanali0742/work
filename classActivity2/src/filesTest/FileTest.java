package filesTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("./test.log");
		boolean fileExists = file.exists();
		System.out.println("File exist - "+ fileExists);
		
		if(!fileExists) {
			
			file.createNewFile();
		}
		
		FileWriter fileWriter = new FileWriter(file,true);
		fileWriter.append("this is a test");
		fileWriter.close();
		
		

	}

}
