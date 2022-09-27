package Strings;

public class split {

	public static void main(String[] args) {
		
		String s = "Radha krishna gudimetla";
		String arr[] = s.split(" ");
		
		System.out.println(" length = " +arr.length);
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println( i+" th posiition  values is :"+arr[i]);
		}
		
		String arr1[] = s.split("a");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println( i+" th posiition  values is :"+arr1[i]);
		}

	}

}
