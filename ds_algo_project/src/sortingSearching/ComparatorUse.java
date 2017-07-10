package sortingSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorUse implements Comparator<Player>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p1 = new Player("Dbc");
		Player p2 = new Player("abc");
		Player p3 = new Player("zdc");
		Player p4 = new Player("plm");
		Player p5 = new Player("qwe");
		Player p6 = new Player("scv");
		Player p7 = new Player("poi");
		p1.score=50;
		p2.score=70;
		p3.score=30;
		p4.score=90;
		p5.score=210;
		p6.score=10;
		p7.score=10;
		ArrayList<Player> a = new ArrayList<Player>();
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);
		a.add(p6);
		a.add(p7);
		Collections.sort(a, new ComparatorUse());
		System.out.println(a);
	}

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.score == o2.score)
		{
			return o1.name.compareTo(o2.name);
		}
		return o1.score-o2.score;
	}
}
class Player
{
	public String name;
	Player(String name)
	{
		this.name = name;
	}
	public int score;
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(name+ " " + score);
		return sb.toString();
	}
}