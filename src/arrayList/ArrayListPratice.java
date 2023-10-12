package arrayList;

import java.util.ArrayList;

public class ArrayListPratice {

	public static void main(String[] args) {
		ArrayList<Integer>v=new ArrayList<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		
		v.add(50);
		System.out.println(v);
		
		System.out.println(v.size());
		
		//v.clear();
		System.out.println(v);
		
		System.out.println(v.get(3));
		
		v.remove(4);
		System.out.println(v);
		
		v.set(0, 30);
		System.out.println(v);
		
		v.set(3, 0);
		System.out.println(v);
		
		System.out.println(v.contains(60));
		
		for(int i=0; i<v.size();i++)
		{
			System.out.print(v.get(i)+ " ");
		}
		
		System.out.println('\n');
		for(Integer n:v)
		{
		System.out.println(n+" ");
		}
		

	}

}
