package InheritancePratice;

public class SubChild extends Child {
		public void house()
		{
			System.out.println("house by own");
		}
	public static void main(String[] args) {
			SubChild c=new SubChild();
			c.bike();
			c.car();
			c.land();
	}

}
