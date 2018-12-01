package bigCompanies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IlluminaMeetingRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval i1= new Interval(0,30);
		Interval i2= new Interval(5,10);
		Interval i3= new Interval(15,20);
		Interval a[] = new Interval[]{i1,i2,i3};
		
		System.out.println(minMeetingRooms(a));
	}
	
	public static int minMeetingRooms(Interval[] intervals) {
	    if(intervals==null||intervals.length==0)
	        return 0;
	 
	    Arrays.sort(intervals, new Comparator<Interval>(){
	        public int compare(Interval i1, Interval i2){
	            return i1.start-i2.start;
	        }
	    });
	 
	    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	    int count=1;
	    queue.offer(intervals[0].end);
	 
	    for(int i=1; i<intervals.length; i++){
	        if(intervals[i].start<queue.peek()){
	            count++;
	 
	        }else{
	            queue.poll();
	        }
	 
	        queue.offer(intervals[i].end);
	    }
	 
	    return count;
	}

}
class Interval
{
	Interval(int s,int e)
	{
		this.start=s;
		this.end=e;
	}
	int start;
	int end;
}