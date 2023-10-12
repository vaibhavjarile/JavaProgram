package arrayDemo;

import java.util.Arrays;

public class Vaa {

	public static void main(String[] args) {
		double b[]= {10.1,20.2,30.3,40.4};
		
		System.out.println(b.length);                         //to print length
		
		System.out.println(b[1]);
		System.out.println(b[3]);
		System.out.println(Arrays.toString(b));
		
		b[0]=10.44;                                          //replace
		System.out.println('\n');                            //for space
		System.out.println(Arrays.toString(b));
		
		for(int i=0;i<b.length;i++)                          //loop
		{
			System.out.print(b[i]+"  ");                     //same line print
		}
		
		System.out.println();
		
		for(double v:b)                                     //old value to new value
		{
			System.out.println(v);
		}
		
	}

}
