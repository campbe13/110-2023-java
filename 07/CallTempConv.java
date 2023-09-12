import java.util.Scanner;
/*
* some code from lecture 7
* call a method
*
* author: pmcampbell
*/ 

public class CallTempConv {
    public static void main(String[] args) {
		java.util.Scanner reader = new java.util.Scanner(System.in);
		double temp = reader.nextDouble();
		
		System.out.println("Fahrenheit "+ temp + " is " + fahrenheitToCelsisus(temp) + " celsius");
        
	}
	public static double fahrenheitToCelsisus(double fahrenheit) {
		return (fahrenheit - 32.0) * 5.0/9.0 ;
	}
}