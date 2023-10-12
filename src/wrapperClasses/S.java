package wrapperClasses;

public class S {

	public static void main(String[] args) {
		int i=10;
		Integer I=Integer.valueOf(i);
		System.out.println(I.intValue());
		
		Character C=Character.valueOf('v');
		System.out.println(C.charValue());
		
		Double D=Double.valueOf(44.44);
		System.out.println(D.doubleValue());

	}

}
