package progs;

import java.util.Scanner;

public class MoreLinked {

	public static Node14 insert(Node14 head, int data) {
		Node14 p = new Node14(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node14 start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node14 head) {
		Node14 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node14 head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
	}

	public static Node14 removeDuplicates(Node14 head) 
	{
		// Write your code here
		int tempData = head.data;
		Node14 temp = head;
		while(head!=null)
		{
			while(head.next!=null && tempData == head.next.data)
			{
				head.next = head.next.next;
			}
			head = head.next;
			if(head!=null)
			{
				tempData = head.data;
			}
		}
		return temp;
	}
}

class Node14 {
	int data;
	Node14 next;

	Node14(int d) {
		data = d;
		next = null;
	}

}