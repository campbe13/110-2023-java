import java.util.Scanner;
/*
* lab 8 graded 
* call a method
*
* author: pmcampbell
*/ 

public class Lab8TempConv {
    public static void main(String[] args) {
		java.util.Scanner reader = new java.util.Scanner(System.in);
		double temp = reader.nextDouble();
		
		System.out.println(temp + " C is " + celsiusToFahrenheit(temp) + " F");
        
	}
	public static double celsiusToFahrenheit(double celsius) {
		return celsius * 9.0/5 + 32.0 ;
	}
}