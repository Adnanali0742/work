package mob;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class partOne {

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

	static double[][] convertToMatrix(double[] array, int targetDimension){
		   double[][] matrix = new double[targetDimension][targetDimension];
		   for (int i=0; i < targetDimension ; i ++){
		      for (int j = 0; j< targetDimension; j++){
		         matrix[i][j] = array[i * targetDimension + j];
		      }
		   }
		   return matrix;
		}
//	
		static void showMatrix(double[][] matrix){
		   for (int i=0; i < matrix.length ; i ++){
		      for (int j = 0; j< matrix[i].length; j++){
		         double value = matrix[i][j];
		         String pixel = "";
		         if (value > 100){
		            pixel = "oo";
		         }else{
		            pixel = "  ";
		         }
		         System.out.print(pixel);
		      }
		      System.out.println();  
		   }
		}
	
}
