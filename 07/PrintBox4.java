import java.util.Scanner;
/*
*	printing boxes 
*	using a method
*   using input characher
*	compiler error  <<<< FIXED
*
* 	author: pmcampbell
*/

public class PrintBox4 {
	public static void main(String[] args) {
		java.util.Scanner reader = new java.util.Scanner(System.in);
		System.out.println("What character should I use for the box? ");
		String symbol = reader.next();
		
		printBox(symbol);
		PrintBox4.printBox(symbol);
		printBox(symbol);
	}
	public static void printBox(String symbol) {
		System.out.println(symbol+symbol+symbol+symbol+symbol);
		System.out.println(symbol+"   "+symbol);
		System.out.println(symbol+"   "+symbol);
		System.out.println(symbol+"   "+symbol);
		System.out.println(symbol+symbol+symbol+symbol+symbol);
	}
}
