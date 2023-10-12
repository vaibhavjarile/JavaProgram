package MultiLevelInheritance;

public class Vaibhav extends Baba {
	public void bike()
	{
		System.out.println("pulsar");
	}
	public static void main(String[] args) {
			Vaibhav obj=new Vaibhav();
			obj.farm();
			obj.land();
			obj.medical();

	}

}
