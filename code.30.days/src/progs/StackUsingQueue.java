package progs;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingQueue obj = new StackUsingQueue();
		obj.push(1);
		//obj.push(2);
		System.out.println(obj.top());
		//System.out.println(obj.pop());
		//System.out.println(obj.pop());
		//obj.push(3);
		//System.out.println(obj.pop());
		//System.out.println(obj.empty());
	}

	Queue<Integer> queue1 = null;
	Queue<Integer> queue2 = null;
	public StackUsingQueue()
	{
		queue1 = new LinkedList();
		queue2 = new LinkedList();
	}
	
	 /** Push element x onto stack. */
    public void push(int x) {
    	if(!queue2.isEmpty())
    	{
    		int l = queue2.size();
    		for(int i=0;i<l;i++)
    		{
    			queue1.add(queue2.remove());
    		}
    	}
    	queue1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	if(!queue1.isEmpty())
    	{
    		int l = queue1.size();
    		for(int i=0;i<l-1;i++)
    		{
    			queue2.add(queue1.remove());
    		}
    		return queue1.remove();
    	}
    	else if(!queue2.isEmpty())
    	{
    		int l = queue2.size();
    		for(int i=0;i<l-1;i++)
    		{
    			queue1.add(queue2.remove());
    		}
    		return queue2.remove();
    	}
    	return -1;
    }
    
    /** Get the top element. */
    public int top() {
    	int r = -1;
    	if(!queue1.isEmpty())
    	{
    		int l = queue1.size();
    		for(int i=0;i<l;i++)
    		{
    			r = queue1.remove();
    			queue2.add(r);
    		}
    	}
    	else if(!queue2.isEmpty())
    	{
    		int l = queue2.size();
    		for(int i=0;i<l;i++)
    		{
    			r = queue2.remove();
    			queue1.add(r);
    		}
    	}
    	return r;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
	
}
