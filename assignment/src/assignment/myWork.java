package assignment;

import java.util.Scanner;

public class myWork {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
		System.out.println("Area and Perimeter of: \n 1 - Triangle "
				+ "\n 2 - Square "
				+ "\n 3 - Circle");	
		
		int ch = s.nextInt();
		if(ch == 1) {
	        Triangle triangle;
	        triangle = new Triangle();
	        triangle.Perimeter();
	        triangle.Area();
				}else if(ch == 2) {
					Square square;
					square = new Square();
					square.Perimeter();
					square.Area();
						}else if(ch == 3) {
							Circle circle;
							circle = new Circle();
							circle.Area();
							circle.Perimeter();
								}else {
									System.out.println("You are genius you can do "
											+ "it by yourself");
								}
		
						}
		
		
		
		
		
		
		
		
		
		
		
		
		
			}
}
	