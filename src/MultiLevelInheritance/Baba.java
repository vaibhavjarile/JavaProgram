package MultiLevelInheritance;

public class Baba extends Ajoba {
	public void medical()
	{
	 System.out.println("medical store in hgt");
	}	
	
	public static void main(String[] args) {
		Baba obj=new Baba();
		obj.farm();
		obj.land();
	}

}
