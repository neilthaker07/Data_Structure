package bigCompanies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

	public static void main(String[] args) {
		System.out.println(topKFrequent22(new String[]{"hi","how","how","how","hi","are","you","hi","I","play","I"}, 2));
	}
	
	public static List<String> topKFrequent22(String[] words, int k) 
	{
        Map<String, Integer> count = new HashMap();
        for (String word: words) 
        {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        
        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                w2.compareTo(w1) : count.get(w1) - count.get(w2) );

        for (String word: count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }

        List<String> ans = new ArrayList();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        return ans;
    }

}
