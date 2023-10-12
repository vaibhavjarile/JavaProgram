package interfacedemo;

public class B implements V {               // 	Child Class
		public void N1()
{
			System.out.println("i am implementation of N1");
}
		public void N2()
		{
			System.out.println("i am implementation of N2");
		}
		public void N()                                         
		{
			System.out.println("i am child implementation");
		}
	
	public static void main(String[] args) {
		B obj=new B();                  //Object
		obj.N1();                      //Calling Method
		obj.N2();
		obj.N();
	}

}
