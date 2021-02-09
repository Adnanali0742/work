package pracWork;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


public class search_name_in_CSV {
    public static void main(String[] arg) throws CsvException{
        search();
    }
    public static void search() throws CsvException{
        try{

            String strSearch = "Hank";

            CSVReader reader = new CSVReader(new FileReader("G:\\java\\data.csv"));
            List<String[]> myEntries = reader.readAll();
            System.out.println(myEntries.size());
            reader.close();

            //Write to existing file
            //CSVWriter writer = new CSVWriter(new FileWriter("test.txt"), ',',CSVWriter.NO_QUOTE_CHARACTER, "\r\n");

            //Iterate through my array to find the row the user input is located on
            int i=1;
            for (String[] line : myEntries)
            {

                String textLine = Arrays.toString(line).replaceAll("\\[|\\]","");
                System.out.println(textLine);
                  if (textLine.contains(strSearch))
                    {
                        //Need a method so I can find out what row my item is on
                        System.out.println("Found - Your item is on row: ...:"+i);

                        //Code to extract row into something (String array?) so I can edit it's contents

                        //I then need to write the edited row back to it's original row

                    }else
                    {
                        System.out.println("Not found");
                    }
                  i++;
            }

       }catch (IOException e)
            {
                System.out.println(e);
            }
    }
}