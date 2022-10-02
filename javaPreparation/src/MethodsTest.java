
public class MethodsTest {

	public static void main(String arr[]) {
		Account ac = new Account();
//		ac.display();
//		ac.setAccountBal(30000);
//		ac.display();
		ac.setAccountBal(20);
		ac.setAccountBal(34);
		ac.setAccountBal(33);
		ac.display();
		
	}
}


class Account{
	
	int AccointBal = 500;
	
	void setAccountBal(int accBal) {
		AccointBal = accBal;
	}
	
	void display() {
		System.out.println(AccointBal);
	}
	
}
