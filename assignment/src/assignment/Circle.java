package assignment;

import java.util.Scanner;

public class Circle{
	double radius, pi = 3.14;
	
	Scanner s = new Scanner(System.in);

	void Area() {
		
		System.out.print("Enter radius of circle:");
		radius = s.nextInt();		//for area
		double area = pi * radius * radius;
		System.out.println("Area of circle:"+area);
		System.out.print("\n");
	}

	void Perimeter(){
		System.out.print("Enter radius of circle:");
        radius = s.nextInt();		// for parimeter
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle:"+perimeter);
        System.out.print("\n");	
	}
}
