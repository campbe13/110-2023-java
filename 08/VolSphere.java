/*
*
* my graded lab solution
* see Andrew's Greeter
* void method, 1 param
*      4/3 * pi * r^3
*
*/
public class VolSphere {
    public static void main(String[] args){
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("What is the radius?");
        String radius = reader.nextDouble();
        calcVolume(radius);
    }
    public static void calcVolume(double radius){
	    double vol = 4.0/3 * Math.PI + Math.pow(radius, 3);
        System.out.println("Sphere of radius "+ radius + " has a volume of " + vol);
    }
}}