package while1;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 153;
		int n = i;
		int sum =0;
		while(i>0) {
			int r= i%10;
			sum = sum+(r*r*r);
			i = i/10;
		}
		
		if(sum==n) {
			System.out.println(" arm stong");
		}
			else {
				System.out.println("not arm strong");
			}
		

	}

}


/*



int i = 153
int n = 153


sum =0
r = 153%10 = 3
sum   =  0+ 3*3*3 = 27
i = 153/10 = 15


r = 15%10 = 5
sum =  27+ 5*5*5 = 152
i = 15/10 = 1


r = 1%10 = 1;
sum = 152+(1*1*1) = 153
i = 1/10 = 0

*/