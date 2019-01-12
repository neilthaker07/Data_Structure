package bigCompanies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class SumoLogic {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5, 1, 3);
		Rectangle r2 = new Rectangle(5, 2, 4);
		Rectangle r3 = new Rectangle(5, 5, 7);
		Rectangle r4 = new Rectangle(5, 6, 8);
		List<Rectangle> list = new ArrayList<Rectangle>();
		list.add(r3);
		list.add(r2);
		list.add(r4);
		list.add(r1);
		System.out.println(process(list));
	}
	
	static int process(List<Rectangle> list)
	{
		Collections.sort(list, new Comparator<Rectangle>() {
			@Override
			public int compare(Rectangle o1, Rectangle o2) {
				return o1.w1-o2.w1;
			}
		});
	
		Stack<Rectangle> stack = new Stack<>();
		stack.push(list.get(0));
		
		for(int i=1;i<list.size();i++)
		{
			Rectangle curr = list.get(i);
			Rectangle temp = stack.peek();
			if(temp.w2 < curr.w1) // not overlap
			{
				stack.push(curr);
			}
			else if(temp.w2 < curr.w2)
			{
				temp.w2 = curr.w2;
				stack.pop();
				stack.push(temp);
			}
		}
		
		int w = 0;
		int h = 0;
		while(!stack.isEmpty())
		{
			Rectangle temp = stack.pop();
			h = temp.h;
			w += (temp.w2 - temp.w1) + 1;
		}
		return w * h;
	}
}

class Rectangle
{
	int h;
	int w1;
	int w2;
	Rectangle(int h, int w1, int w2)
	{
		this.h=h;
		this.w1=w1;
		this.w2=w2;
	}
}