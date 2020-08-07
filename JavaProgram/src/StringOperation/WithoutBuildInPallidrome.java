package StringOperation;

import java.util.Scanner;

public class WithoutBuildInPallidrome {
	static boolean pallidrome(String s)
	{
		char [] c= s.toCharArray();
		String s1="";
		for(int i=c.length-1; i>=0; i--)
		{
			s1+=c[i];
		}	
		if(s.equals(s1))
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a [] = s.toCharArray();
		int n = a.length;
		int j=0; 
		int count=0;
		for(int i=0; i<n;)
		{
			String s1="";
			while(j<n&&a[j]!=' ')
			{
				s1+=a[j];
				j++;
			}
			if(pallidrome(s1))
			{
				count++;
			}
			int k=j+1; 
			j=k;
			i=j;
		}
		System.out.println(count);
		sc.close();
	}

	}

