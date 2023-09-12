/*
*	printing boxes 
*	using a method
*
* 	author: pmcampbell
*/

public class PrintBox2 {
	public static void main(String[] args) {
		printBox();
		PrintBox2.printBox();
		printBox();
	}
	public static void printBox() {
		System.out.println("*****");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*****");
	}
}
