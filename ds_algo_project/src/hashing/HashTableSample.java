package hashing;

import java.util.Hashtable;
import java.util.Map;

public class HashTableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(115, "hello");
		h.put(34, "qwer");
		h.put(5, "asdfg");
		h.put(77, "iop");
		h.put(90, "cvb");
		System.out.println(h.get(5));
		for(Integer a : h.keySet())
		{
			System.out.println(a);
		}
		
		for(Map.Entry m : h.entrySet())
		{
			System.out.println(m.getKey() + "   " + m.getValue());
		}
	}

}
