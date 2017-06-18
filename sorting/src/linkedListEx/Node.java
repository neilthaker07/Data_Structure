package linkedListEx;

public class Node implements Comparable {

	private int value;
	private Node next;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}
	
	@Override
	public String toString()
	{
		StringBuilder a = new StringBuilder();
		//a.append("Value : "+value+", Next Ref : "+next);
		a.append(value+" ");
		return a.toString();
	}
}
