package pracWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cvsDataToConsol {
	public static void main(String a[]) throws IOException
	{
		File file = new File("G:\\java\\data.csv");

		// read the lines from file
		List<String> lines = Files.readAllLines(file.toPath());

		// transform each line
		List<Person> persons = new ArrayList<Person>();

		lines.remove(0);

		for (String line : lines) {
			
			// if you want to print only two lines of csv
//		for (int i = 0; i < 2; i++) {
			try {
				// uncomment it if you want to print two lines
//			    String[] filds = lines.get(i).split(",");
				String[] filds = line.split(",");
				String name = filds[0].trim().replace("\"", "");
				String sex = filds[1].trim().replace("\"", "");
				Integer age = Integer.valueOf(filds[2].trim());
				Integer height = Integer.valueOf(filds[3].trim());
				Integer weight = Integer.valueOf(filds[4].trim());

				Person person = new Person(name, age, weight, height, sex);
				persons.add(person);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println(persons.size());
		System.out.println(persons);


	}
}