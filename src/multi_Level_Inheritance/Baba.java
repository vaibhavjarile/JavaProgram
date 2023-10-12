package multi_Level_Inheritance;

public class Baba extends Ajoba {           //Child              //Use extends with Ajoba 
		public void home()
		{
			System.out.println("home in hinganghat");
		}
		public void store()
		{
			System.out.println("kirana shop");
		}
	
	public static void main(String[] args) {
		 Baba obj=new Baba();                              //Object
		 obj.farm();                                       //Calling method
		 obj.land();

	}

}
