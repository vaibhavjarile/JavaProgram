package exceptionHandaling;

public class V {

	public static void main(String[] args) {
		String s="vaibhav";                                   //Length 7char    index0-6
		try
		{
			System.out.println(s.charAt(8));
		}
		catch (StringIndexOutOfBoundsException e) {              //to handal exception
			System.out.println("this is exception handaling");
		}
		catch (ArithmeticException e) {
			System.out.println("this is exception");
		}
		finally {                                              //Exception occur or  not handaling it will print
			System.out.println("exception");
		}
	}
}

