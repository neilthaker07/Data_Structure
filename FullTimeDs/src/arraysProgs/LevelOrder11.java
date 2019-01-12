package arraysProgs;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder11 {

	public static void main(String[] args) {
		T1 t1 = new T1(1);
		T1 t2 = new T1(2);
		T1 t3 = new T1(3);
		T1 t4 = new T1(4);
		T1 t5 = new T1(5);
		T1 t6 = new T1(6);
		T1 t7 = new T1(7);
		
		t1.l=t2;
		t1.r=t3;
		t2.l=t4;
		t2.r=t5;
		t3.l=t6;
		t3.r=t7;
		
		process(t1);
	}
	static void process(T1 root)
	{
		List<T1> l =new ArrayList<T1>();
		l.add(root);
		process2(l);
	}
	static void process2(List<T1> l)
	{
		if(l.size()==0)
		{
			return;
		}
		List<T1> l2 = new ArrayList<T1>();
		for(T1 y : l)
		{
			System.out.print(y.val+" ");
			if(y.l != null)
			{
				l2.add(y.l);
			}
			if(y.r != null)
			{
				l2.add(y.r);
			}
		}
		System.out.println();
		process2(l2);
	}
}

class T1
{
	T1 l;
	T1 r;
	int val;
	T1(int val)
	{
		this.val=val;
	}
}