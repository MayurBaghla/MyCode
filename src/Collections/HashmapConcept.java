package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapConcept {
	
	//hashmap is a class that implements Map Interface and extends abstartMap
	//it is non synchronized
	//contains only unique values
	//stores the values in Key Value pair
	//Use Entry set for traversal of the Key value pairs
	//it may have one null Key and multiple null values
	// it maintains no order
	//Concurrent modification exception means Fail fast condition-- when one thread is making changes to a variable and another thread is accessing the same variable
	//then Concurrent modification exception can come in between 


	public static void main(String[] args)
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Selenium");
		
		hm.put(2, "UFT");
		hm.put(3, "Postman");
		
		
		System.out.println(hm.get(1));
		
		
		for(Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(hm);
		 
		HashMap<Integer , Employee> emp =new HashMap<Integer,Employee>();
			
		
		Employee e1= new Employee(25, "Mayur", "ECE");
		Employee e2= new Employee(35, "Anshika", "CSE");
		Employee e3= new Employee(45, "Gaurav", "Agri");
		
		
		//in hashmap
		
		emp.put(1, e1);
		
		emp.put(2, e2);
		
		emp.put(3, e3);
		
		for (Entry<Integer,Employee> m:emp.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println(key + " Info : ");
			System.out.println(e.Name  +" " +e.Age+" "+ e.Dept);
			
		}
	}
}
