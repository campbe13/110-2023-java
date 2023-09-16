public class DayConverter {
    public static void main(String[] args){
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("How many days?");
        int days = reader.nextInt();
        int hours = daysToHours(days);
        int minutes = hoursToMinutes(hours);
        System.out.println(days +" days is "+ minutes +" minutes");
    }
    public static int hoursToMinutes(int hours){
        return hours*60;
    }
    public static int daysToHours(int days){
        return days*24;
    }
    
}