package ConstructorANDObjects;

public class MethodTest3 {

	public static void main(String[] args) {
	
		student1 n1 = new student1();
		n1.setName("radha");
		
		String s1 = n1.getName();
		System.out.println(s1);
		
		n1.SetRoleNO(789);
		int p = n1.getRoleNum();
		System.out.println(p);
	}
}

class student1 {
	
	String name = "";
	
	int RoleNO= 2;
	
	
	void SetRoleNO(int roll) {
		RoleNO = roll;
	}
	
	int getRoleNum() {
		return RoleNO;
	}
	
	
	
	public void setName(String na) {
		name = na;
		
	}
	
	String getName() {
		  return name;
	  }

}
