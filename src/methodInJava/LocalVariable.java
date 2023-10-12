package methodInJava;

public class LocalVariable {
			public void V1()    //Method
			{
				String name="VAIBHAV JARILE";     //Local Variable
				System.out.println("name:"+name);
			}
	public static void main(String[] args) {    //Main Method
			int id=20;
			System.out.println("id:"+id);   //Local Variable
				LocalVariable obj=new LocalVariable();  // Object
				obj.V1();		//Calling method
			

	}

}
