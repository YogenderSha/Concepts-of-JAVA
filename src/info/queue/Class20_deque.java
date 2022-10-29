package info.queue;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Class20_deque {

	public static void main(String[] args) {
		 

		Deque<Integer> deque = new LinkedBlockingDeque<>(6);
		System.out.println(deque.peek());
			deque.offer(1);
			deque.offer(2);
			deque.offer(3);
			deque.offer(4);
			deque.offer(5);
			deque.offer(6);
			deque.offer(7);
		
		for(Integer element: deque){
			System.out.println(element);
		}
		System.out.println("********************");
		System.out.println("removed element from Dequeue: "+deque.poll());
		System.out.println(deque.peek());

	}

}
