package ConstructorANDObjects;


// in a java we wite many classes . but only one class is public
// Java program Execution starts with main
// One class object can be created in other class.

public class anyClssws {

	public static void main(String[] args) {
		radha  r = new radha();
		r.setRadha(1000);
		int ii = r.getRadha();
		System.out.println(ii);
	}

}

class radha {
	
	int i = 100;
	
	public void setRadha(int radha1){
		this.i = radha1;
	
	}
	
	public int getRadha() {
		return this.i;
	}
}


class naveen {
	
	int i = 100;
	
	public void setRadha(int radha1){
		this.i = radha1;
	
	}
	
	public int getRadha() {
		return this.i;
	}
}
