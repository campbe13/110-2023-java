import java.util.Scanner;
/*
* some code from lecture 7
* call a method
*
* author: pmcampbell
*/ 

public class CallsayGreeting {
    public static void main(String[] args) {
		java.util.Scanner reader = new java.util.Scanner(System.in);
		String speaker = reader.next();
		String listener = reader.next();
		
        sayGreeting(speaker, listener);

	}
	public static void sayGreeting(String name1, String name2) {
		System.out.println("Welcome "+listener +" my name is " + speaker);
	}
}