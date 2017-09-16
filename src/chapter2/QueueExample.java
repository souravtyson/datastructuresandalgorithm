package chapter2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			queue.add(i);
		}

		System.out.println("element in the queue is : " + queue);
		int removed = queue.remove();
		System.out.println(removed + " is removed");
		int top = queue.peek();
		System.out.println("top element is : "+ top);
		System.out.println(queue);
	}
}
