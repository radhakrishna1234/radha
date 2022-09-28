package Strings;

public class CharacterClass {

	public static void main(String[] args) {
		
		
		int a =10;
		
		char c = 'j';		
		System.out.println(c);
		
		char c1 = '1';
		
		boolean b = Character.isLetter(c1);		
		System.out.println(b);
		
		boolean b1 = Character.isDigit(c1);
		System.out.println(b1);
		
		
		char c2 = 'a';
		char C2 = Character.toUpperCase(c2);
		System.out.println(C2);
		
		
		char c3 = 'D';
		char C3 = Character.toLowerCase(c3);
		System.out.println(C3);
		
		
		/*
		String s = "rad#1h1a kr2ish5n$a";
		
		for(int i= 0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
		
			if(Character.isLetter(c)) {
				System.out.println(c + " is a letter");
			} else if(Character.isDigit(c)) {
				System.out.println(c + " is a digit");
			}else  {
				System.out.println(c + " is a special char ");
			}
			
			
			
			
		}
		*/
		
	
	}

}
