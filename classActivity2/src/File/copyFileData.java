//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.nio.file.Files;
//
//public class copyFileData {
//public static void main(String[] args) throws IOException {
//List<String> listOfLines = Files.readAllLines(new File("G:\\java\\data.csv").toPath());
//System.out.println(listOfLines);
//List<Data> people = new ArrayList<Data>();
//listOfLines.remove(0);
//for (String line : listOfLines) {
//line = line.replaceAll("\"", ""); // remove double quotes from the whole string.
//line = line.replaceAll(" ", ""); // remove double quotes from the whole string.
//String[] l = line.split(",");
//try {
//people.add(new Data(l[0],l[1], Integer.parseInt(l[2]), Double.parseDouble(l[3]),Double.parseDouble(l[4])));
//} catch (NumberFormatException nfe) {
//nfe.printStackTrace();
//}
//
//}
//for(Data i: people)
//System.out.println(i.toString());
//}
//}