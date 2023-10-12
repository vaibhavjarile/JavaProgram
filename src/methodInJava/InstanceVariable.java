package methodInJava;

public class InstanceVariable {     //Class
		int x=10;                  //Instance Method
		public void V1()     //Method
		{
			System.out.println(x);
		}
			String s="Vaibhav Jarile";
			public void V2()
			{
				System.out.println(s);
			}
		public static void main(String[] args) {
		InstanceVariable obj=new InstanceVariable();    //Object
		obj.V1();      //Calling Method
		obj.V2();
		System.out.println(obj.x);
		System.out.println(obj.s);
	}

}
