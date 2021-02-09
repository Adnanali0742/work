package assignment;

import java.util.Scanner;

public class Triangle{
	
	double side1, side2, side3;	
	Scanner s = new Scanner(System.in);
	
	void Perimeter() {

		System.out.print("Enter length of first side of triangle:");
        side1 = s.nextInt();
        System.out.print("Enter length of second side of triangle:");
        side2 = s.nextInt();
        System.out.print("Enter length of third side of triangle:");
        side3 = s.nextInt();
        
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of triangle:"+perimeter);
        System.out.print("\n");
	}
	
	void Area() {
		System.out.print("Enter width of triangle:");
        side1 = s.nextInt();		// side1 is width of triangle in this case
        System.out.print("Enter height of triangle:");
        side2 = s.nextInt(); 		// side2 is height of triangle in this case
        
        double area = (side1*side2)/2;
        System.out.println("The area of triangle is: "+area);
        System.out.print("\n");
	}







}

