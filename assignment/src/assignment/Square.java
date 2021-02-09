package assignment;

import java.util.Scanner;

public class Square{
	
	double height, width;	
	Scanner s = new Scanner(System.in);
	
	void Perimeter() {
		System.out.print("Enter height of Square:");
        height = s.nextInt();
        System.out.print("Enter width of square:");
        width = s.nextInt();
		
		double square = height + width;
		System.out.println("Perimeter of triangle:"+square);
		System.out.print("\n");
	}

	void Area(){
		System.out.print("Enter height of any side Square:");
        height = s.nextInt();		// height of any side of square
        
        double area = (height*height);
        System.out.println("The area of square is: "+area);
        System.out.print("\n");
	}
	

}
