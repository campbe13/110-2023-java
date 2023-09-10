import java.util.Scanner;
/*
* ask user for two sides of a right angle triangle 
* use the sides to calcuate the hypoteneuse
* use the hyp and sides to calulate and display the perimiter & hypoteneuse
*
* using flowchart from lab 03
*
* author: pcampbell
*/ 

public class Pythagorean {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
		int side1, side2, hypoteneuse, perimeter;
		
		// one read for each input
		System.out.println("Lengtht of  side1 of your triangle:");
		side1 = reader.nextInt();  
		System.out.println("Lengtht of  side2 of your triangle:");
		side2 = reader.nextInt();  
		
		// c^2 = a^2 + b^2
		// so c = sqrt of a^2 + b^2
		hypoteneuse = Math.sqrt(side1 * side1 + side2 * side2);
		
		perimiter = hypoteneuse + side1 + side2
		
		System.out.println("Your trinangle has a hypoteneuse of " + hypoteneuse + " and a perimeter of " + perimeter);
    }
}