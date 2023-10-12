package constructor;

public class V {
	public V()                                   //Same method name as class name
	{
		System.out.println("i am constructor");
	}
	public V(int x)                               //With parameter
	{
		System.out.println(x);
	}
	public V(int y,int z)
	{
		System.out.println(y+z);
	}
	public V(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
			V obj= new V();
			V obj2=new V(10);
			V obj3=new V(10,20);
			V obj4=new V(10,20,30);
			V obj5=new V('a','b','c');
	}
	

}
