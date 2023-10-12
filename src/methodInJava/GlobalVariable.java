package methodInJava;

public class GlobalVariable {                     //Class	
		static int x=10;                          //Static Variable
		public void V1()                          //Method
		{
			System.out.println(x);
		}
      public static void main(String[] args) {
		System.out.println(x);                          //Directly
		GlobalVariable obj=new GlobalVariable();       //Object
		System.out.println(obj.x);                     //Using Object Reference
		System.out.println(GlobalVariable.x);         //Using Class Reference
		obj.V1();
	}

}
