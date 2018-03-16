package progs;

import java.util.Stack;

public class QueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingStack obj = new QueueUsingStack();
		obj.push(1);
		obj.push(2);
		System.out.println(obj.peek());
		
	}
	
	Stack<Integer> stack1 = null;
	Stack<Integer> stack2 = null;
	public QueueUsingStack()
	{
		stack1 = new Stack();
		stack2 = new Stack();
	}
	
	 /** Push element x to the back of queue. */
    public void push(int x) {
        if(!stack2.isEmpty())
    	{
        	int l = stack2.size();
        	for(int i=0;i<l;i++ )
        	{
        		stack1.push(stack2.pop());
        	}
        }
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
    	if(!stack1.isEmpty())
    	{
    		int l = stack1.size();
	    	for(int i=0;i<l;i++ )
	    	{
	    		stack2.push(stack1.pop());
	    	}
    	}
    	int a = -1;
    	if(stack2.size()>0)
    	{
    		a = stack2.pop();
    	}
    	return a;
    }
    
    /** Get the front element. */
    public int peek() {
    	
    	if(!stack1.isEmpty())
    	{
    		int l = stack1.size();
        	for(int i=0;i<l;i++ )
        	{
        		stack2.push(stack1.pop());
        	}
        }
    	return stack2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}
