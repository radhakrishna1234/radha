package Strings;

public class toPrintFormat {

	public static void main(String[] args) {
		
		
		
	/*	
		String s = "9a";
		char c = s.charAt(0);  // char c = '9';  int  a = 9;
		
		if(Character.isDigit(c)) {
			int p = Character.getNumericValue(c);
			for(int i=1;i<=p;i++) {
				System.out.println(s.charAt(1));
			}
		}
		*/
		
		/*
		char c = '9';
		
		int p= Character.getNumericValue(c);
		
		for(int i=1;i<=p;i++) {
			System.out.println("a");
		}
		*/
		
		/*
		String s = " krishna ";
		char arr[] = s.toCharArray();
		
		for(int i = 1;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		
		String s = "radha krishna gudimetla";
		String arr[] = s.split(" ");
		for(int i =0;i<arr.length;i++) {
			System.out.println(i +" th values  "+arr[i]);
		}

	}

}
