package recursionDp;


public class PaintFill {

	enum Color
	{
		GREEN, RED, BLUE, YELLOW
	}
	Color newColor = Color.RED;
	Color screen[][] = new Color[50][50];
	Color dest = Color.YELLOW;
	
	public static void main(String[] args) {
		
		PaintFill p = new PaintFill();
		
		p.screen[14][15]=Color.RED;
		p.screen[15][16]=Color.RED;
		p.screen[16][17]=Color.RED;
		p.screen[14][14]=Color.RED;
		p.screen[14][16]=Color.RED;
		p.screen[15][15]=Color.RED;
		p.screen[14][15]=Color.RED;
		p.screen[14][15]=Color.RED;
		System.out.println(p.process(p.dest, Color.RED,15 , 15));
	}

	public boolean process(Color dest, Color ocolor,int r, int c)
	{
		if(screen[r][c]==dest)
		{
			return false;
		}
		if(screen[r][c]==ocolor)
		{
			screen[r][c] = dest;
			process(dest, ocolor, r-1, c);
			process(dest, ocolor, r+1, c);
			process(dest, ocolor, r, c-1);
			process(dest,ocolor,  r, c+1);
		}
		return true;
	}
}