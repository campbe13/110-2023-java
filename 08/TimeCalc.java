/*
*
* my graded lab solution
*
*/

public class TimeCalc {
    public static void main(String[] args){
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("How many hours?");
        int hours = reader.nextInt();
        int days = hoursToDays(hours);
        int years = daysToYears(days);
        System.out.println(hours +" hours is "+ years +" years");
    }
    public static int hoursToDays(int hours){
        return hours/24;
    }
    public static int daysToYears(int days){
        return days/365;
    }
    
}