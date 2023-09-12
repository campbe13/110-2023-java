import java.util.Scanner;

// Scanner example from lecture 05

public class ScannerExample {
  public static void main(String[] args)  {
    java.util.Scanner reader = new java.util.Scanner(System.in);
	int number, fraction;
	
	System.out.println(“Enter a number”);
	number = reader.nextInt(); 
 
    System.out.println(“Enter another number”);
    fraction = reader.nextInt();
  }
}