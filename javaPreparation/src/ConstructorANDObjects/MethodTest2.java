package ConstructorANDObjects;

public class MethodTest2 {

	public static void main(String[] args) {
		radha1 r1 = new radha1();
		r1.displya();
		r1.setComapnt("tcs");
		r1.setComapnt("wipro");
		r1.displya();
		
		
		
		radha1 r2 = new radha1();	
		r2.displya();
		r2.displya();
		r2.setComapnt("apple");
		r2.setComapnt("google");
		r2.displya();
		r2.displya();
		
		
		
		radha1 r3 = new radha1();	
		r3.setComapnt("microsoft");
		
		r3.displya();
		r2.displya();
		

	}

}


class radha1 {
	
	String company = "opentext";
	
	void setComapnt(String comp) {
		company = comp;
	}
	
	void displya() {
		System.out.println(company);
	}
	
}
