package File;

import java.io.File;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("G:\\java\\file.txt");
			if(myObj.createNewFile()) {
				System.out.println("File "+myObj.getName()+" is creted");
			}
			else {
				System.out.println("File is already exist");
			}
		}catch(IOException e) {
			System.out.println("An error is occured.");
			e.printStackTrace();
		}

	}

}
