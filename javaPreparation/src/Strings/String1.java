package Strings;

public class String1 {

	public static void main(String[] args) {
		
		
		String s = "radha krishna";
		String s2 = "Radha krishna";
		
		char c = s.charAt(2);
		
		System.out.println(c);
		
		int i = s.compareTo(s2);
		System.out.println(i);
		
		
		int p =  s.compareToIgnoreCase(s2);
		System.out.println(p);
		
		
		String s3 = s.concat(s2);
		System.out.println(s3);
		
		
	boolean b =	s.contains("ii");
	System.out.println(b);
	
	
	boolean b1 = s.equals(s2);
	   System.out.println(b1);
	   
	  boolean b2=  s.equalsIgnoreCase(s2);
	  System.out.println(b2);
	  
	 int ii =  s.indexOf('d');
	 System.out.println(ii);
	 
	 int lastIndex = s.lastIndexOf("h");
	 System.out.println(lastIndex);
	 
	 
	String replaced =  s.replace('a', 'K');
	System.out.println(replaced);
	
	String replace = s.replace("dh", "pm");
	System.out.println(replace);

	}

}
