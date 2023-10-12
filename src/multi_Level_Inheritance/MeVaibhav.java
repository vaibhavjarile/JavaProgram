package multi_Level_Inheritance;

public class MeVaibhav extends Baba {          //Sub Child              //Use extends with Baba
        public void bike()
        {
        	System.out.println("bike pulsar");
        }
	 
	
	public static void main(String[] args) {
			MeVaibhav obj=new MeVaibhav();                       //Object
			obj.home();                                     //Calling Method
			obj.farm();
			obj.store();
			obj.land();
	}

}
