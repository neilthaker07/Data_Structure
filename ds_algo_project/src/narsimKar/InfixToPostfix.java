package narsimKar;

import java.util.ArrayList;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] a = new char[]{'1','*','2','-','(','3','+','4',')','+','5'};
		char[] a = new char[]{'1','+','2','*','3','-','(','4','+','9',')'};
		ArrayList<Character> operand = new ArrayList<Character>();
		operand.add('0');
		operand.add('1');
		operand.add('2');
		operand.add('3');
		operand.add('4');
		operand.add('5');
		operand.add('6');
		operand.add('7');
		operand.add('8');
		operand.add('9');
		
		ArrayList<Character> operator = new ArrayList<Character>();
		operator.add('*');
		operator.add('+');
		operator.add('/');
		operator.add('-');
		operator.add('(');
		operator.add(')');
		
		ArrayList op = new ArrayList();
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<a.length;i++)
		{
			if(operand.contains(a[i]))
			{
				op.add(a[i]);
			}
			else if(operator.contains(a[i]))
			{
				if(a[i]==')')
				{
					ArrayList<Character> temp = new ArrayList<Character>();
					while(stack.peek()!='(')
					{
						temp.add(stack.pop());
					}
					stack.pop();
					int k=0;
					while(!temp.isEmpty())
					{
						op.add(temp.get(k));
						temp.remove(k);
						k++;
					}
				}
				else if(stack.isEmpty() || stackHasLowerPriorityTop(stack, a[i]))
				{
					stack.add(a[i]);
				}
				else if(!stackHasLowerPriorityTop(stack, a[i]))
				{
					while(!stack.isEmpty() && !stackHasLowerPriorityTop(stack, a[i]))
					{
						op.add(stack.pop());
					}
					stack.add(a[i]);
				}
			}
		}
		while(!stack.isEmpty())
		{
			op.add(stack.pop());
		}
		System.out.println(op);
	}
	
	public static boolean stackHasLowerPriorityTop(Stack<Character> stack, char c)
	{
		char q = stack.peek();
		if(c=='(')
		{
			return true;
		}
		else if(c=='-')
		{
			return q=='-'|| q=='(' ? true : false;
		}
		else if(c=='+')
		{
			return q=='-' || q=='+' || q=='(' ? true : false;
		}
		else if(c=='*')
		{
			return q=='+' || q=='-' || q=='*' || q=='(' ? true : false;
		}
		else if(c=='/')
		{
			return q=='+' || q=='-' || q=='*' || q=='/' || q=='(' ? true : false;
		}
		return false;
	}
}
