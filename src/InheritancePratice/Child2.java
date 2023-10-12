package InheritancePratice;

public class Child2 extends Parent {
       public void farm()
       {
    	   System.out.println("farm in village");
       }
	public static void main(String[] args) {
			Child2 obj=new Child2();
			obj.land();
			obj.car();
	}

}
