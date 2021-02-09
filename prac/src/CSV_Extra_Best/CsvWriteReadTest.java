package CSV_Extra_Best;

public class CsvWriteReadTest {
	public static void main(String[] args) {

		String fileName = "G:\\java\\fileMe3.csv";

		//		System.out.println("Write CSV file:");
		//		CsvFileWriter.writeCsvFile(fileName);

		System.out.println("\nRead CSV file:");
		CsvFileReader.readCsvFile(fileName);

	}
}
