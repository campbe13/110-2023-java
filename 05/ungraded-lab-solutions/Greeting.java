import java.util.Scanner;
/*
* ask for user name (first & last)
* ask for favoourite class
*
* author: pcampbell
*/ 

public class Skeleton {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
		String fname, lname, course, bothNames;
		
		// one read for each input
		System.out.println("What is your first name");
		fname = reader.next();   // reads a word
		
		System.out.println("What is your last name");
		lname = reader.next();   // reads a word
		
		System.out.println("What is your favourite class");
		course = reader.next();   // reads a word
		
		System.out.println("Welcome " + fname + " " + lname + " I like " + course + " too!");
		
		
		// read first and last name at the same time 
		System.out.println("What is your first name and last name (type both then hit enter");
		bothNames = reader.nextLine();   // reads the line (up to the enter)
		
		System.out.println("Welcome " + bothNames + " I like " + course + " too!");
		
		
    }
}