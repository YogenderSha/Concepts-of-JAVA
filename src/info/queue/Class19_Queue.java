package info.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Class19_Queue {

	public static void main(String[] args) {
	
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
		System.out.println(queue.peek());
			queue.offer(1);
			queue.offer(2);
			queue.offer(3);
			queue.offer(4);
			queue.offer(5);
			queue.offer(6);
			queue.offer(7);
		
		for(Integer element: queue){
			System.out.println(element);
		}
		System.out.println("********************");
		System.out.println("removed element from Queue: "+queue.poll());
		System.out.println(queue.peek());

	}

}
