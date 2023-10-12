package languagePackage;

public class V {

	public static void main(String[] args) {
		String s="vaibhav jarile";
		String s1="vaibhav jarile";
		
			System.out.println(s.length());                // it will print total length
			System.out.println(s.charAt(4));				// it will print fourth char and after letter also
			System.out.println(s.substring(2));             //it will print letter after a
			System.out.println(s.equals(s1));               // it will find String matches String2 than give in bullean ie true or false
			System.out.println(s.equalsIgnoreCase(s1));    // it will ignore the case
			System.out.println(s.concat( " " +s1));       //it will add String
			System.out.println(s.indexOf('a'));          // it will print no index and in index first letter start as zero
			System.out.println(s.replace('v', 'a'));     //it will replace v with a
			System.out.println(s.trim());                 //it will trim space but not middle one
			System.out.println(s.startsWith("v"));       //it will check letter start with v than true if not than false
			System.out.println(s.startsWith("vaibh"));
			System.out.println(s.endsWith("rile"));       //it will check ending if ok than true not than false
		
		
		
		
		
		
		}
	}


