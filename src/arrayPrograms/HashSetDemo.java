package arrayPrograms;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Double> obj=new HashSet<Double>();   
		obj.add(10.0);
		obj.add(20.0);
		obj.add(30.0);
		obj.add(40.0);
		System.out.println(obj);
		
		System.out.println(obj.size());         //to calculate length
		
		obj.remove(10.0);
		System.out.println(obj);
		
		//obj.clear();
		System.out.println(obj);
		
		//obj.getClass(0);                    //not applicable because the concept of index value is not applicable here
		System.out.println(obj);
		
		
		obj.add(60.0);
		System.out.println(obj);
		 System.out.println('\n');
		for(double v:obj)
		{
			System.out.println(v);
		}
	}

}
