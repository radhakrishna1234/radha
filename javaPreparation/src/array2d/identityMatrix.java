package array2d;

public class identityMatrix {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Identity matrix
		/*
		for(int i= 0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(i==j) {
					System.out.println(a[i][j]);
				}
				
				
			}
			
			
		}
		
		*/
		
		
		
		//lower trangle 
		/*
		for(int i= 0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(i>j) {
					System.out.println(a[i][j]);
				}
				
				
			}
			
			
		}
		
		*/
		
		
		
		//upper trangle
		
		for(int i= 0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(i<j) {
					System.out.println(a[i][j]);
				}
				
				
			}
			
			
		}
		
		
		

	}

}
