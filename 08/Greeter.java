/*
*
* Andrew's graded lab solution
* void method 1 param
*
*/
public class Greeter {
    public static void main(String[] args){
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        String name = reader.next();
        greet(name);
    }
    public static void greet(String name){
        System.out.println("Hi "+ name + ", nice to meet you");
    }
}}