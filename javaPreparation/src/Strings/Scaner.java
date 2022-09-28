package Strings;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a value");
		double a1 = sc.nextDouble();
		
		System.out.println(" enter b value");
		double a2 = sc.nextDouble();
		
		double a3 =  calcDouble(a1,a2);
		System.out.println(a3);
		
	}
	
	static double calcDouble(double a, double b) {
		return a+b;
	}

}
