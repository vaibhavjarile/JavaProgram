package praticeInterface;

public class Child implements Vaibhav{
		public void S1()
		{
			System.out.println("i am s1");
		}
		public void S2()
		{
			System.out.println("i am s2");
		}
		public void S3()
		{
			System.out.println("i am s3");
		}
		
		public static void main(String[] args) {
			Child C=new Child();
			C.S1();
			C.S2();
			C.S3();
		}
}
