import java.util.Scanner;
/*
* ask user for the cost of the meal
* calculate taxes, service charge 
* display taxes, service and total to pay
* using flowchart from lab 04
*
* author: pcampbell
*/ 

public class RestoTipTotal {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
		double price, gst, pst, priceWTax, service, total;
		
		// one read for each input
		System.out.println("What is the cost of your meal:");
		price = reader.nextDouble();  
		
		gst =  price * 0.05;
		qst =  price * 0.09975;
		
		priceWTax = price + gst + qst
		
		service = priceWTax * 0.18;
		
		total = priceWTax + service;
		
		System.out.print("Price: 	", price);
		System.out.print("gst:   	", gst);
		System.out.print("pst:	 	", pst);
		System.out.print("subtotal: ", priceWTax);
		System.out.print("service: 	", service);
		System.out.print("--------------------------");
		System.out.print("Total: 	", total);

    }
}