package naveen;

public class diffStaticVSNonStatic {
	
	int a = 10;
	int b = 20;
	static int c = 30;
	static int d = 40;
	
	
	void add() {
		System.out.println(a+b);
	}
	
	void sub() {
	    System.out.println(a-b);
	}
	
	void mul() {
		System.out.println(a*b);
	}
	
	void div( ) {
		
		System.out.println(a/b);
	}
	
	
	
	
	
	static void add1() {
		System.out.println(c+d);
	}
	
	static void sub1() {
	    System.out.println(c-d);
	}
	
	static void mul1() {
		System.out.println(c*d);
	}
	
	static void div1( ) {
		
		System.out.println(c/d);
	}
	
	
	

	public static void main(String[] args) {
		add1();
		sub1();
		mul1();
		div1();
		diffStaticVSNonStatic obj = new diffStaticVSNonStatic();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		
		
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
	}

}
