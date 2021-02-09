package csvHandling;

import java.io.*;
import java.util.ArrayList;
public class person {
   public static void readFile() throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader("G:\\java\\mnist_train.csv"));
	    ArrayList<String> lines = new ArrayList<String>();
	    String newLine;
	    while ((newLine = br.readLine()) != null) {
	        System.out.println(newLine);
	        lines.add(newLine);
	    }
	    br.close();
	}

   public static void main(String[] args) throws IOException {
       readFile();
   }
}