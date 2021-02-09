package classActivity2Excercise;
import java.util.Scanner;
public class classWork2 {

	public static void main(String[] args) throws Exception {
	    Scanner s = new Scanner(System.in);
	    String[] array = new String[20];

	    System.out.println("Please enter 20 names to sort");

	    for (int i = 0; i < array.length; i++) {
	        array[i] = s.nextLine();
	    }

	    //Just to test
	    for(int i =0; i<array.length; i++) {
	    System.out.println(array[i]);
	    }
	}

}