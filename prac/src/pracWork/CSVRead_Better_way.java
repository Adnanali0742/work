package pracWork;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CSVRead_Better_way {
    private static final String SAMPLE_CSV_FILE_PATH = "G:\\java\\fileMe.csv";

    public static void main(String[] args) throws IOException, CsvException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading Records One by One in a String array
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Make : " + nextRecord[0]);
                System.out.println("Model : " + nextRecord[1]);
                System.out.println("Description : " + nextRecord[2]);
                System.out.println("Price : " + nextRecord[3]);
                System.out.println("==========================");
            }
        }
    }
}