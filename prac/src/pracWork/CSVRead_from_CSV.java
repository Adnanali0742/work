package pracWork;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CSVRead_from_CSV {

	private static final String SAMPLE_CSV_FILE_PATH = "G:\\java\\fileMe.csv";

	public static void main(String[] args) throws IOException, CsvException {

		// Read all and returns a List<String[]>.
		    	try (CSVReader reader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
		    	      List<String[]> r = reader.readAll();
		    	      r.forEach(x -> System.out.println(Arrays.toString(x)));
		    	  }

		// Read line by line and turns line into a String[].
		//		try (CSVReader reader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH))) {
		//		      String[] lineInArray;
		//		      while ((lineInArray = reader.readNext()) != null) {
		//		          System.out.println(lineInArray[0] + lineInArray[1] + lineInArray[2]);
		//		      }
		//		  }

		//It is common to use the semicolon ; as the separator. This OpenCSV example shows how to parse 
		//a CSV file using a custom separator ; and skip the first line.

		//		 CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
		//		  try(CSVReader reader = new CSVReaderBuilder(
		//		          new FileReader(SAMPLE_CSV_FILE_PATH))
		//		          .withCSVParser(csvParser)   // custom CSV parser
		//		          .withSkipLines(1)           // skip the first line, header info
		//		          .build()){
		//		      List<String[]> r = reader.readAll();
		//		      r.forEach(x -> System.out.println(Arrays.toString(x)));
		//		  }
	}

}