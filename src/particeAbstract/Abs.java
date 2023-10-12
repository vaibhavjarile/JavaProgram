package particeAbstract;

public class Abs extends Abstract {                              //Child
		public void V1()
		{
			System.out.println("i am implementation of V1");
		}
		public void V2()
		{
			System.out.println("i am implemantation of V2");
		}
	public static void main(String[] args) {
			Abs A=new Abs();
			A.V1();
			A.V2();
			A.V3();
	}

}
