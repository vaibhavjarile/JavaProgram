package methodInJava;

public class PMethod {
		public void V1()
		{
			System.out.println("i am a method");
		}
			public void add(int x, int y)
			{
				System.out.println(x+y);
			}
				public void add(String S)
				{
					System.out.println("this is string arg method");
				}
					public void add(double d, double e)
					{
						System.out.println("this is double arg method");
					}
	           public static void main(String[] args) {
	        	   		PMethod org=new PMethod();
	        	   		org.V1();
	        	   		org.add(10,30);
	        	   		org.add("vaibhav");
	        	   		org.add(10.30,20.30);
	        	   		

	}

}
