package wrapperClasses;

public class V {

	public static void main(String[] args) {
		int i=10;
		Integer I=Integer.valueOf(i);               // convert Primitive into object
		Integer I1=Integer.valueOf(20);             //2nd approach
		System.out.println(I);
		System.out.println(I1);

		char c='v';
		Character C=Character.valueOf(c);
		System.out.println(C);
		
		double d=44.44;
		Double D=Double.valueOf(d);
		System.out.println(D);
		
		boolean b=true;
		Boolean B=Boolean.valueOf(b);
		System.out.println(B);	
		
		float f=10.0f;
		Float F=Float.valueOf(f);
		System.out.println(F);
	}

}
