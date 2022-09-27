package Strings;

import java.io.InputStream;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println(" Enter item ");
		String item = sc1.next();
		System.out.println(item(item));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Enter frist num ");
//		int frist= sc.nextInt();
//		
//		System.out.println(" Enter Second  num ");
//		
//		int second = sc.nextInt();
//		
//		
//		System.out.println(" sum is "+(frist+second));

	}
	

	 static int item(String item) 
	{
		 int price = 30;
		
		 if(item.contentEquals("idely")) {
			  price = 30;
			 
		 } else if(item.contentEquals("dosa")) {
			  price = 40;
		 }
		 else if(item.contentEquals("voda")) {
			  price = 50;
		 }
		 return price;
		 
	}
	
	

}
