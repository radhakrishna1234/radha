package ConstructorANDObjects;
//If to reference varables can also pointing to same object. so one object changed values will reflect to other object.
public class exConstructure {

	int i = 10;
	
	public static void main(String[] args) {
		
		exConstructure ex = new exConstructure();		
		//System.out.println(ex.i);
		
		exConstructure ex1 = new exConstructure();	
		
		ex1.i = 12; 
		System.out.println(ex1.i);
		System.out.println(ex.i);
		
		exConstructure ex2 =  ex1;
		
		System.out.println(ex2.i);
		
		ex2.i = ex2.i+100;
		
		System.out.println(ex1.i);
		
		System.out.println(ex2.i);
		
		ex2.i = 300;
		
		System.out.println(ex1.i);
		System.out.println(ex2.i);
		
		
		
		
		

	}

}

//  exConstructure ex = new exConstructure();


// ex reference varaible



// new -- memery allocation in run time  or creating an object


// If to reference varables can also pointing to same object. so one object changed values will reflect to other object.