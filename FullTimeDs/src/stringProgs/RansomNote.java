package stringProgs;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canConstruct("abc", "abdefc");
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        int a[] = new int[128];
        if(ransomNote.length() > magazine.length())
        {
            return false;
        }
        else {
            
            for(int i=0;i<ransomNote.length();i++)
            {
                a[ransomNote.charAt(i)]++;
            }
            
            for(int i=0;i<magazine.length();i++)
            {
                a[magazine.charAt(i)]--;
                
            }
            
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(a[ransomNote.charAt(i)]>0)
            {
                return false;
            }
        }
        return true;
        
    }

}
