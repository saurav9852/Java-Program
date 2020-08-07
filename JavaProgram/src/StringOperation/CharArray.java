package StringOperation;
import java.util.*;

public class CharArray {
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1="";
		for(int i=0; i<s.length(); )
		{
			char c = s.charAt(i);
			int j=i+1;
			while(j<s.length()&&c==s.charAt(j))
			{
				j++;
			}
			i=j;
			s1=s1+c;	
		}
		System.out.println(s1);
		sc.close();
	}
}
