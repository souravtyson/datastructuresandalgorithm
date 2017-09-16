package chapter2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		Collection<String> coll = Arrays.asList("violet", "indigo", "blue", "green",
				"yellow", "orange", "red");
		Iterator<String> itr = coll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
