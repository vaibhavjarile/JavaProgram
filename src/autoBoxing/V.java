package autoBoxing;

public class V {

	public static void main(String[] args) {
		int i=10;
		
		Integer I=i;                          //automatic i.e Autoboxing
		System.out.println(I);                // here java has taken value automatically
		
		Double D=Double.valueOf(44.44);       //Un-boxing
		Double d=D;                          // here....xxxValue method is internally used by java compilor
		System.out.println(D);         
	}

}
