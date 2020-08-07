package StringOperation;

import java.util.Scanner;

public class TestCountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char a[] = s.toCharArray();
		String s2="";
		for(char c='a'; c<='z'; c++)
		{
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(c==a[i])
				{
					count++;
				}
			}
			if(count>0)
			{
				s2=s2+count+c;
			}
		}
		System.out.println(s2);
		sc.close();
	}
}
