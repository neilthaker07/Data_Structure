package odoo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {}
	
	public static boolean stringContainsRegex()
	{
		String text = "w344#rulesfgfgOdoos";
		String patternString = ".*Odoo.*#rules.*|.*#rules.*Odoo.*";
		Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches() ? true : false;
	}
}