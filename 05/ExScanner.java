import java.util.Scanner;
/*
* Using Scanner to read a String
* coded for single word input only
*
* author: P Campbell
*/ 

public class ExScanner {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
		String name;
		
		System.out.print("What is your name: "); 
		name = reader.next();
		System.out.println("Welcome " + name); 
		
    }
}