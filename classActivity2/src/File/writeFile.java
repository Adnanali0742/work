package File;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class writeFile {
	private static void IamLog(String data) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(new File("G:\\java\\file.txt"));
            os.write(data.getBytes(), 0, data.length());
        	System.out.println("DONE");
        } catch (IOException e) {
        	e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
public static void main(String[] args) {
	String data = "hello there, this is the data I have write using IamLog function to the file";
	IamLog(data);
	}
}
