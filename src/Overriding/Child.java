package Overriding;

public class Child extends Parent{
		public void car()
		{
			System.out.println("audi");
		}
   public static void main(String[] args) {
			Child obj=new Child();
			obj.land();
			obj.car();
			
   }

}
