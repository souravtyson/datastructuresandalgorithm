package chapter2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,1,2,3,5,8,13,21,34);
		System.out.println(Collections.binarySearch(list1, 2));

	}

}
