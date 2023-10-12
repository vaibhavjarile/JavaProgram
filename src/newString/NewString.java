package newString;

import java.util.Arrays;

public class NewString {

	public static void main(String[] args) {
		String s[]=new String[3]; 
		
		s[0]="vaibhav";
		s[1]="sunanda";
		s[2]="nikita";
		//s[3]="yuwraj";
		
		System.out.println(Arrays.toString(s));
		
		System.out.println(s.length);
		
		System.out.println('\n');
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
