import java.util.Scanner;
/*
* some code from lecture 7
* call a method
*
* author: pmcampbell
*/ 

public class CalldoStuff {
    public static void main(String[] args) {
        int x = 3;
		doStuff(x,4);
	}
	public static void doStuff(int z) {
		int x = z + 3;
		System.out.println(x);
	}
}