package methodInJava;

public class AllVariable { // Class
	public void V1() // Method
	{
		int i = 10; // Local Variable
		System.out.println("Local Variable:" + i);
	}

	int x = 20; // Instance Variable

	public void S1() // method
	{
		System.out.println("Instance Variable:" + x);
	}

	static int n = 30; // Static Variable
    public void N1() // method
	{
		System.out.println("Static Variable :" + n);
	}

	public static void main(String[] args) {
		System.out.println(n); // Directly
		AllVariable obj = new AllVariable(); // Object
		obj.V1(); // Calling Method
		obj.S1();
		obj.N1();
		System.out.println(obj.n); // Using Object reference
		System.out.println(AllVariable.n); // Using Class reference

	}

}
