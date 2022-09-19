package while1;

public class pallendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =121;
		int n = i;
		int sum =0;
		
		while(i>0) {
			int r = i%10;
			sum= sum*10+r;
			i = i/10;
		}
		if(sum==n) {
			System.out.println(" pallendroe");
		} else
			System.out.println(" not pallenrome");

	}

}

/*

int i = 121
    n = 121
------------------	itr 1
	r = 1
	sum = 1
	i = 12
--------------------- it2	
	r = 2	
	sum = 1*10+2 = 12	
	i = 1
	
--------------------------	itr3
	r = 1	
	sum= 12*10+1 = 121	
	i = 0
	
*/