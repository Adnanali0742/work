package pracWork;



//import com.opencsv.CSVWriter;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class one {
//
//    public static void main(String[] args) throws IOException {
//
//        List<String[]> csvData = createCsvDataSimple();
//
//        // default all fields are enclosed in double quotes
//        // default separator is a comma
//        try (CSVWriter writer = new CSVWriter(new FileWriter("G:\\java\\fileMe.csv"))) {
//            writer.writeAll(csvData);
//        }
//
//    }
//
//    private static List<String[]> createCsvDataSimple() {
//        String[] header = {"id", "name", "address", "phone"};
//        String[] record1 = {"1", "first name", "address 1", "11111"};
//        String[] record2 = {"2", "second name", "address 2", "22222"};
//
//        List<String[]> list = new ArrayList<>();
//        list.add(header);
//        list.add(record1);
//        list.add(record2);
//
//        return list;
//    }
//
//}


import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.ICSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVWrite_to_CSV {
	
	private static final String SAMPLE_CSV_FILE_PATH = "G:\\java\\fileMe.csv";

	public static void main(String[] args) throws IOException, CsvException {

		List<String[]> csvData = createCsvDataSpecial();

		// default all fields are enclosed in double quotes
		// default separator is a comma
				try (CSVWriter writer = new CSVWriter(new FileWriter(SAMPLE_CSV_FILE_PATH))) {
					writer.writeAll(csvData);

		//		try (ICSVWriter writer = new CSVWriterBuilder(
		//				new FileWriter("G:\\java\\fileMe.csv"))
		//				.withSeparator(';')
		//				.build()) {
		//			writer.writeAll(csvData);



	}
}

private static List<String[]> createCsvDataSpecial() {

	String[] header = {"Make", "Model", "Description", "Price"};
	String[] record1 = {"Dell", "P3421W", "Dell 34, Curved, USB-C Monitor", "2499.00"};
	// embedded double quotes
	String[] record2 = {"Dell", "", "Alienware 38 Curved \"Gaming Monitor\"", "6699.00"};
	// embedded double quotes and commas
	String[] record3 = {"Samsung", "", "49\" Dual QHD, QLED, HDR1000", "6199.00"};
	// embedded line break
	String[] record4 = {"Samsung", "", "Promotion! Special Price Dual QHD, QLED, HDR1000", "4999.00"};

	List<String[]> list = new ArrayList<>();
	list.add(header);
	list.add(record1);
	list.add(record2);
	list.add(record3);
	list.add(record4);



	return list;

}

}