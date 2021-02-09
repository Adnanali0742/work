package pracWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class print_two_lines_Mob_Class {
	public static void main(String[] args) throws IOException {
		   List<String> lines = Files.readAllLines(new File("G:\\java\\mnist_train.csv").toPath());
		   List<double[]> linesAsDouble = new ArrayList<>();
		   lines.remove(0);
		   for (int i = 0; i < lines.size(); i++){
		      String[] parts = lines.get(i).split(",");
		      double[] lineAsDouble = new double[parts.length];
		      for (int j = 0 ; j < parts.length ; j++){
		         String cell = parts[j];
		         lineAsDouble[j] = Double.parseDouble(cell);
		      }
		      linesAsDouble.add(lineAsDouble);
		   }
//		   List<double[]> first2lines = linesAsDouble.subList(0, 2);
		   for (int j = 0 ; j < 2 ; j++) {
		      double[] doubles = linesAsDouble.get(j);
		      for (int i = 0 ; i < doubles.length; i++){
		         System.out.print(doubles[i] + " ");
		      }
		      System.out.println();
		   }

		}

}
