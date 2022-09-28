package Strings;

public class CharacterUpper {

	public static void main(String[] args) {
		
		
		/*
		 
	
		String s = "radha";
		
		for(int i=0;i<s.length();i++) {
			//System.out.println( Character.toUpperCase(s.charAt(i))  );
	
			char c =s.charAt(i);
			
			char c1 = Character.toUpperCase(c);
			
			System.out.println(c1);
			
		}
			*/ 
		
		String s = "RADHA";
		
		for(int i=0;i<s.length();i++) {
			//System.out.println( Character.toUpperCase(s.charAt(i))  );
	
			char c =s.charAt(i);
			
			char c1 = Character.toLowerCase(c);
			
			System.out.println(c1);
			
		}
		
		

	}

}
