package arraysProgs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Words {

	public static void main(String[] args) throws Exception {
		
		System.out.print(countWord("/home/neil/Desktop/100-0.txt", "Shakespeare"));
	}
	
	static ArrayList<String> countWord(String inputFile, String inputWord) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		String line = br.readLine();
		//int counter = 0;
		int totalFileWords = 0;
		
		Map<String, Integer> map = new HashMap();
		String prevLineLastWord = null;

		while(line!=null)
		{
			line = line.trim();
			String words[] = line.split("\\s+");
			
			for(int i=0; i< words.length;i++)
			{
				totalFileWords++;
				String first = words[i];
				String second = null;
				if(i+1<words.length)
				{
					second = words[i+1];
					
					String key = first + " : " +second;
					map.put(key.toLowerCase(), map.getOrDefault(key.toLowerCase(), 0) + 1);
				}
				else
				{
					if(words.length == 1)
					{
						String key = prevLineLastWord + " : " +first;
						map.put(key.toLowerCase(), map.getOrDefault(key.toLowerCase(), 0) + 1);	
					}
					prevLineLastWord = first;
				}
			}
			/*for(String word : words)
			{
				map.put(word.toLowerCase(), map.getOrDefault(word.toLowerCase(), 0) + 1);
				totalFileWords++;
				
				if(word.equalsIgnoreCase(inputWord))
				{
					counter++;
				}
			}*/
			line = br.readLine();
		}
		
		ArrayList<String> process[] = new ArrayList[totalFileWords];
		for(int i=0;i<process.length;i++)
		{
			process[i] = new ArrayList<String>();
		}
		
		for(Map.Entry<String, Integer> e : map.entrySet())
		{
			String key = e.getKey();
			int val = e.getValue();
			
			process[val].add(key);
		}
		
		ArrayList<String> output = new ArrayList();
		int k = 10;
		int temp = 0;
		for(int i=process.length-1;i>=0 && temp < k;i--)
		{
			ArrayList<String> eachList = process[i];
			
			for(String str : eachList)
			{
				if(temp>=k)
				{
					break;
				}
				output.add(str);
				temp++;
			}
		}
		
		return output;
	}

}
