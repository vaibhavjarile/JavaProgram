package javapratice;

public class Result {
	public static void main(String[] args) {
		int mark=50;
		if(mark>=75)
		{
			System.out.println("Distinction");
		}
		else if(mark>=60 && mark<75)
		{
			System.out.println("First Class");
		}
		else if(mark>=50 && mark<60)
		{
			System.out.println("Secound Class");
		}
		else if(mark>=35 && mark<50)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Failed");
		}
	
	}
}
