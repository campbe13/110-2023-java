import java.util.Scanner;
/*
*	printing boxes 
*	using a method
*   using input characher
*	compiler error  <<<< why?
*
* 	author: pmcampbell
*/

public class PrintBox3 {
	public static void main(String[] args) {
		java.util.Scanner reader = new java.util.Scanner(System.in);
		System.out.println("What character should I use for the box? ");
		String symbol = reader.next();
		
		printBox();
		PrintBox3.printBox();
		printBox();
	}
	public static void printBox() {
		System.out.println(symbol+symbol+symbol+symbol+symbol);
		System.out.println(symbol+"   "+symbol);
		System.out.println(symbol+"   "+symbol);
		System.out.println(symbol+"   "+symbol);
		System.out.println(symbol+symbol+symbol+symbol+symbol);
	}
}
