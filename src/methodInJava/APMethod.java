package methodInJava;

public class APMethod {
		public void add(int x)
		{
			System.out.println(x);
		}
		public void V1(float f)
		{
			System.out.println(f);
		}
			
			public static void main(String[] args) {
		      APMethod obj=new APMethod();
		      obj.add(10);
		      obj.add(500);
		      obj.add('a');
		      obj.V1(10.10f);
		      obj.V1('b');
		      obj.V1(10f);
		      obj.add(1000);
			}

}
