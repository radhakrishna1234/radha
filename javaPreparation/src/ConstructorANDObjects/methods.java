package ConstructorANDObjects;

public class methods {
	
	int amount =10 ;
	
	void setAmount(int amt) {
		amount = amount+amt;
	}
	
	int display() {
		return amount;
	}

	public static void main(String[] args) {
	
		methods m = new methods();
	    
		int initial = m.display();
		System.out.println(initial);
		
		
		m.setAmount(100);
		int after = m.display();
		System.out.println(after);
		
		
		
		methods m1 = new methods();
		m1.setAmount(500);
		System.out.println(m1.display());
		
		
		
		methods m2 = new methods();
		m2.setAmount(700);
		System.out.println(m2.display());	
		
		
		methods m3 = m2; 
		
		m2.setAmount(1000);
		
		System.out.println(m3.display());
		
		
		
		
	}

}
