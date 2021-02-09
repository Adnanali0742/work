package pracWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;




public class CSV_ageDistribution_Sorting {

	private static final int VALUE_FOR_FEMALE = 1;
	private static final int VALUE_FOR_MALE = 0;

	public static void main(String[] args) throws IOException {
		File file = new File("G:\\java\\data.csv");

		// read the lines from file
		List<String> lines = Files.readAllLines(file.toPath());

		// transform each line into a person
		List<Person> persons = new ArrayList<>();
		lines.remove(0);
		for (String line : lines) {

			try {
				// "Name", "Sex", "Age", "Height (in)", "Weight (lbs)"
				String[] fields = line.split(",");
				String name = fields[0].trim().replaceAll("\"", "");
				String sex = fields[1].trim().replaceAll("\"", "");
				Integer age = Integer.valueOf(fields[2].trim());
				Integer height = Integer.valueOf(fields[3].trim());
				Integer weight = Integer.valueOf(fields[4].trim());

				Person person = new Person(name, age, weight, height, sex);

				persons.add(person);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println(persons.size());
		System.out.println(persons);

		// --------------------Age Distribution 1st method------------------------

		Map<Integer, Integer> ageDistributionMap = new LinkedHashMap<>();
		for (Person person : persons) {
			Integer count = ageDistributionMap.get(person.getAge());
			if (count == null) {
				count = 1;
			}else {
				count++;
			}
			ageDistributionMap.put(person.getAge(), count);
		}

		System.out.println("Age distribution: "+ ageDistributionMap);


		//---------------Age Distribution 2nd method----------------------------

//		persons.stream().mapToInt(Person::getHeight);
//		Map<Integer,Long> map = persons.stream()
//				.collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
//		System.out.println("age distribution");
//		System.out.println(map);

		
		// ------ if age is repeated then put == sign other wise = ---------------
		
		for (Entry<Integer, Integer> entry : ageDistributionMap.entrySet()) {
			String level = "";
			for(int i = 0; i < entry.getValue(); i++) {
				level+= "=";
			}
			System.out.println(entry.getKey() + " : " + level);
		}
		
		
		// -------------------------------------------------------------------------
		
		
		
		
	}

}
