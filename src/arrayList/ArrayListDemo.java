package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>obj=new ArrayList<String>();
		
			obj.add("pune");                               //add this String
			obj.add("nagpur");
			obj.add("wardha");
			obj.add("banglore");
			System.out.println(obj);                       //print String
			
			System.out.println(obj.size());                //print size of String 
			
			System.out.println(obj.get(0));                //print the index value of zero(0)
			
			obj.add("chandrapur");                         //add the String in existing
			System.out.println(obj);
			
			obj.remove(1);                                //remove the index value of (1)
			System.out.println(obj);
			
			obj.set(3, "mul");                           //set the value of index(3) as New String
			System.out.println(obj);
			
			obj.set(0," ramtek");                         //set the value of index(0) as new String
			System.out.println(obj);
			//obj.clear();                                //clear or remove the whole string
			System.out.println(obj);
			
			System.out.println(obj.contains("wardha"));        //show the result in bollean
			
			for(int i=0;i<obj.size();i++)                   //loop to print i ie get(i);
			{
				System.out.println(obj.get(i));
			}	
	     System.out.println('\n');
			
			for(String v:obj)                                  //old string to new string
	       {
	    	   System.out.println(v+" ");
	       }
	
	}

}
