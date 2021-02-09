package classActivity2Excercise;

import java.util.Scanner;

public class Main {

	private static final Object arg = "123";
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Hi there Please enter you credentials: ");
			System.out.println("User Name: "); 
			String name = s.nextLine();
//			System.out.println("Login"); 	   
//			String Login = s.nextLine();	// for now I did not use Login 
			System.out.println("Password: ");  
			String pwd = s.nextLine();
		
		//authentication
		if(pwd.equals(arg)){
//			System.out.println("Login Details "+Login);
		    System.out.println("Hello Mr/Mrs. "+name+ " What do you want to do: ");

		    
			boolean flag = true;
			while(flag) {
			int ch, menu;
		    System.out.println("Select Menu by type its number \n1 - Update"
		    		+ "\n2 - Delete \n3 - Create");
		    menu = s.nextInt();
		    switch(menu) {
		    case 1:	
		    	System.out.println("You are in the Update Menu, Mr/Mrs. "+name+ 
		    			"\nWhat do you want next: \n1 - Stop \n2 - Continue");
		    	ch = s.nextInt();
		    	if(ch==1) {
		    		flag = false;
		    	}
		    	break;
		    case 2:
		    	System.out.println("You are in the Delete Menu, Mr/Mrs. "+name+
		    			"\nWhat do you want next: \n1 - Stop \n2 - Continue");
		    	ch = s.nextInt();
		    	if(ch==1) {
		    		flag = false;
		    	}
		    	break;
		    case 3:
		    	System.out.println("You are in the Create Menu, Mr/Mrs. "+name+
		    			"\nWhat do you want next: \n1 - Stop \n2 - Continue");
		    	ch = s.nextInt();
		    	if(ch==1) {
		    		flag = false;
		    	}
		    	break;
		    default:
		    	System.out.println("You make a wronge choice, Mr/Mrs. "+name+ " Please try again\n");
		    	break;
		    		}
				}
			}
			else{
				System.out.println("Please try again.");
				
					}  	
				}	
			}
		}

