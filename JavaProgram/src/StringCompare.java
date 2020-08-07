import java.util.Arrays;
import java.util.Comparator;

public class StringCompare {
	public static void main (String args [])
	{
		String [] a = {"java", "c", "javascript", "html", "css", "Amredra"};
		Arrays.sort(a, new A());
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}
class A implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((String)o1).length()-((String)o2).length();
	}
}