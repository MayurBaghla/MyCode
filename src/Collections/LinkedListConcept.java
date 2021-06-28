package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		
		LinkedList<String> ll= new LinkedList<String>();
		
		ll.add("Mayur");
		
		ll.add("Anshika");
		
		ll.addFirst("New");

		ll.addLast("End");
		//for loop
		for(int i = 0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
			
			
			
			System.out.println(ll.get(1));
			
			System.out.println("******************************");
			//advancedFor Loop
			
			for (String str:ll) {
				System.out.println(str);
			}
			
			
			
			System.out.println("******************************");
			//iterator Loop
			
			Iterator<String> it=ll.iterator();
			while(it.hasNext())
			{
				
				System.out.println(it.next());
				
			}
			//while loop
			System.out.println("******************************");
			int num=0;
			while (ll.size()>num)
			{
				System.out.println(ll.get(num));
				num++;
			}
			}
			
		
		
	}

