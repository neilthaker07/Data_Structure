package sortingSearching;

public class StringSearchBlank {

	String[] s = new String[]{"abc","","","","","blm","","qcd","","","","","","wert","zsd","","zzz"};
	String searching = "zzz";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringSearchBlank a = new StringSearchBlank();
		System.out.println(a.search(0, a.s.length));
	}
	
	int count = 0;
	public int search(int start, int end)
	{
		int mid = (start+end)%2!= 0 ? (start+end)/2 : ((start+end)/2)+1;
		
		if(count > s.length)
		{
			return -1;
		}
		else
		{
			count++;
			if(s[mid].isEmpty())
			{
				for(int j=mid+1; j<end;j++)
				{
					if(!s[j].isEmpty())
					{
						mid = j;
						break;
					}
				}
			}
			if(s[mid].isEmpty())
			{
				for(int j=mid; j>=start;j--)
				{
					if(!s[j].isEmpty())
					{
						mid = j;
						break;
					}
				}
			}
			if(s[mid].equals(searching))
			{
				return mid;
			}
			else if(searching.compareTo(s[mid]) < 0)
			{
				return search(start, mid-1);
			}
			else
			{
				return search(mid+1, end);
			}
		}
	}
}