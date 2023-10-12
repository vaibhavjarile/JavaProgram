package Abstraction;

public class B extends V {
		public void S1()
		{
			System.out.println("i am implementaion of S1");
		}
		public void S2()
		{
			System.out.println("i am implementation of S2");
		}
	public static void main(String[] args) {
			B obj =new B();
			obj.S1();
			obj.S2();
			obj.S3();
	}

}
