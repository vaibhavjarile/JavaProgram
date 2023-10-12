package Overloading;

public class OverLoading {
		public void add()
		{
			System.out.println("this is no argument method");
		}
		public void add(int x)
		{
			System.out.println("this is argument method");
		}
		public void add(int x,int y)
		{
			System.out.println(x+y);
		}
		public static void main(String[] args) {
				OverLoading obj=new OverLoading();
				obj.add();
				obj.add(100);
				obj.add(10, 20);
				
		}

}
