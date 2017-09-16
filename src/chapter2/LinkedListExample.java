package chapter2;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("A");
		llist.add("B");
		llist.add("C");
		llist.add("D");
		llist.add("E");
		llist.add("F");
		
		llist.addFirst("K");
		System.out.println(llist);
		System.out.println("last element in my list : "+llist.getLast());
		
		ListIterator<String> itr = llist.listIterator(llist.size());
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}

}
