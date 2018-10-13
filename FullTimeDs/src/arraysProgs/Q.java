package arraysProgs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<>();
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> al = new ArrayList<Integer>();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		// Adds elements {0, 1, 2, 3, 4} to queue
		for (int i = 0; i < 5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue-" + q);

		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-" + head);

		// Rest all methods of collection interface,
		// Like size and contains can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue-" + size);
	}

}
