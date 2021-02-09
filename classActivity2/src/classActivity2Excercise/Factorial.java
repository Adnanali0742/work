package classActivity2Excercise;
import java.util.Scanner;

public class Factorial {
	static long forFact(int n){
		long fact = 1;
		for(int i=1;i<=n;i++){	
	    	fact=fact*i; 
 	    }
		return fact;
  	}
	
	static void whileFact(int n){
		long i=1, fact=1;
	    while(i<=n)
	    {
	    	fact=fact*i;
	    	i++;
 	    	}
  	    System.out.println("factorial using While Loop is ="+fact); 
	}
	
	public static void doWhileFact(int n) {
		long i=1, fact=1;
        do{
          fact=fact*i;
          i++;
        	}
        while(i<=n);
        	System.out.println("factorial using Do While Loop is ="+fact);
	}
	
public static void main(String arg[]){
	int num;
	Scanner s = new Scanner(System.in);
	System.out.println("Please Enter the number: ");
	num = s.nextInt();
	
	long f = Factorial.forFact(num);
	System.out.println("Factorial Using For Loop is = "+f);
	
	Factorial.whileFact(num);
	Factorial.doWhileFact(num);
		
	}
}
  
