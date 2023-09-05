import java.util.Scanner;
/*
* Using Scanner to read a side length 
* & calculate the area of a square
* coded for int input only 
*
* author: P Campbell
*/ 

public class ExAreaSquare {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
		int area, side;
		
		System.out.print("Enter the length of the side of a square please: "); 
		side = reader.nextInt();
		
		area = side * side;
		
		System.out.println("A square with a side of "+side+ " has an area of " + area); 
    }
}