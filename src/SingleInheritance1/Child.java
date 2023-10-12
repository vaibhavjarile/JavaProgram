package SingleInheritance1;

public class Child extends Parent {
	public void bike()
	{
		System.out.println("pulsar ");
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.car();
		obj.property();
	}

}
