import java.util.Scanner;
/*
* some code from lecture 6
*
* author: pmcampbell
*/ 

public class MathMagic {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
		
		System.out.println("1/2" + (1/2));
		System.out.println("1/2 + 1/2" + (1/2 + 1/2));
		
		System.out.println("1/3" + (1/3));
		System.out.println("2/3" + (2/3));
		System.out.println("1/3 + 2/3" + (1/3 + 2/3));

		System.out.println("5 + 8/3+2.0*(4-1)" + (5 + 8/3+2.0*(4-1)));

		System.out.println("3*4/2+ \”1\""+ (3*4/2+ ”1”));
		
    }
}