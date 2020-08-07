package StringOperation;

import java.util.Scanner;

public class DistinctCharcter {
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(char c='a'; c<='z'; c++)
		{
			int count=0;
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i)==c)
					count++;
			//	System.out.print(s.charAt(i));
			}
			if(count>0)
			{
				System.out.print(c);
			}
		}
		sc.close();
	}

}
