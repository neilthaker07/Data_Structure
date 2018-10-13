package progs;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MinStack obj = new MinStack();
		 obj.push(5);
		 obj.pop();
		 int param_3 = obj.top();
		 int param_4 = obj.getMin();
	}

	Stack<Integer> stack = null;
	int min = Integer.MAX_VALUE;
	public MinStack()
	{
		stack = new Stack();
	}
	
	public void push(int x) {
		// Push min with element when min changes.
		if(x<=min)
		{
			//stack.push();
			min = x;
		}
		stack.push(x);
		
	}
    
    public void pop() {
		// pop min with element when min changes.
    	
    	if(stack.pop() == min)
    	{
    		min = stack.pop();
    	}
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
	
}
