package oasisLabs;

import java.util.HashMap;
import java.util.Map;

public class S2 {

	public static void main(String[] args) {
		
		//String q [] =renameFiles(new String[]{"doc","n","doc","doc(1)","doc"});
		 //String q [] =renameFiles(new String[]{"a(1)","a(6)","a","a","a","a","a","a","a","a","a"});
		 String q [] =renameFiles(new String[]{"dd","dd(1)","dd(2)","dd","dd(1)","dd(1)(2)","dd(1)(1)","dd","dd(1)"});
		for(String h : q)
		{
			System.out.println(h);
		}
		
		/*Map<String, Integer> StringCount = new HashMap<>();
        StringBuilder strBld = new StringBuilder();
        String[] res = new String[input.length];
        int index = 0;
        for(String str: input){
            strBld.setLength(0);
            strBld.append(str);
            int count = 0, prevCount = 0;
            while(StringCount.containsKey(strBld.toString())){
                StringCount.put(str,prevCount);
                StringBuilder temp = new StringBuilder();
                count = StringCount.get(str);
                count++;
                temp.append("(" + count + ")");
                strBld.setLength(0);
                strBld.append(str);
                strBld.append(temp);
                prevCount = count;
            }
            StringCount.put(str, count);
            StringCount.put(strBld.toString(), 0);
            res[index] = strBld.toString();
            index++;
        }
        return res;*/
	}
	
	public static String[] renameFiles(String input[])
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] op = new String[input.length];
		int i=0;
		for(String s:input)
		{
			String temp = "";
			if(map.containsKey(s))
			{
				int x = map.get(s);
				x++;
				map.put(s, x);
			
				temp+= s + "("+ x +")";
				while(map.containsKey(temp))
				{
					x++;
					map.put(s, x);
					temp = s + "("+ x +")";
				}
				
				map.put(temp, 0);
			}
			else
			{
				temp = s;
				map.put(s, 0);
			}
			op[i]=temp;
			i++;
		}
		return op;
	}
}
