package csvHandling;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;


public class file { 
	public static void main(String[] args) { 
		List<Persons> person = readDataOfCSV("G:\\java\\data.csv");  
		person.remove(0);
		System.out.println("data in 2 Dimension is as follows: \n");  
		for (Persons b : person) { 
			System.out.println(b); 
			} 
		to2dMatrix(person);
		} 

	
	private static List<Persons> readDataOfCSV(String fileName) { 
		List<Persons> persons = new ArrayList<>(); 
		Path pathToFile = Paths.get(fileName); 
		try (BufferedReader br = Files.newBufferedReader(pathToFile)) { 
			String line = br.readLine(); 
			while (line != null) { 
				String[] attributes = line.split(","); 
				Persons data = createCSV(attributes); 
				persons.add(data);
				line = br.readLine(); 
				} 
			} catch (IOException ioe) { 
				ioe.printStackTrace(); 
				} 
		return persons; 
		} 
	private static Persons createCSV(String[] metadata) { 
		String name = metadata[0].trim().replaceAll("\"", ""); 
		String sex = metadata[1].trim().replaceAll("\"", "");
		String age = metadata[2].trim().replaceAll("\"", "");
		String height = metadata[3].trim().replaceAll("\"", "");
		String weight = metadata[4].trim().replaceAll("\"", ""); 
		return new Persons(name, sex, age, height, weight ); 
		} 
	

	public static String[][] to2dMatrix(List<Persons> person) {
		String[][] results = new String[5][20];
		
		for (int i=0 ; i<results.length ; i++) {
			if(person.get(i).getSex().equals("M"))
				results[i][0]="M";
//			for(int j=0 ; j<5 ; j++) {
				System.out.println(results[i]);
		//	}
		}
		
		
		return results;
	}
	
	private static List<Persons> from2dMatrix(double[][] person) {
		List<Persons> results = new ArrayList<Persons>();
		
	
		return results;
				
	}
















}


