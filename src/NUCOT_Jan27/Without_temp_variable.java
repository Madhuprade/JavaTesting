package NUCOT_Jan27;

import java.util.Scanner;

public class Without_temp_variable {

	 public static void main(String a[])   
	    {   
	        System.out.println("Enter the value of x and y");  
	        try (Scanner sc = new Scanner(System.in)) {
				/*Define variables*/  
				int x = sc.nextInt();  
				int y = sc.nextInt();  
				System.out.println("before swapping numbers: "+x +" "+ y);  
      /*Swapping*/  
				x = x + y;   
				y = x - y;   
				x = x - y;   
				System.out.println("After swapping: "+x +"  " + y);
			}   
	    }   
	}  