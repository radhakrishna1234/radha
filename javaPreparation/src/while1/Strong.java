package while1;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 145;
		
	    int n = i ;
	    int sum =0;

     while(i>0) {
	    	int r = i%10;
	    	sum =sum + fact(r);
	    	i = i/10;
	    }
	    
		
     if(sum == n)
    	 System.out.println(" Strong ");
     else
    	 System.out.println("not stromg ");
		
		
		
		

	}
	
	
	public static int fact(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++)
			fact = fact*i;
		return fact;
	}

}
