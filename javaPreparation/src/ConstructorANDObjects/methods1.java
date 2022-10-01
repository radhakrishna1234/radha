package ConstructorANDObjects;

public class methods1 {
	
	
	int i = 10;
	
	void print1() {
		System.out.println(i);
	}

	int print2() {
		return i;
	}
	

	public static void main(String[] args) {
		
		//int amount = 100;
		
		methods1 m1 = new methods1();
		
//		m1.print1();
//		m1.print1();
//		m1.print1();
		
	int ex = m1.print2();
	System.out.println(ex);
		
		

	}

}
