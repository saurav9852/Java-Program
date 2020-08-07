package StringOperation;

import java.util.Scanner;

public class NoOfPallidromeInSenetence {
	static boolean checkPallidrome(String s)
	{
		String s1="";
		int n=s.length();
		for(int i=n-1; i>=0; i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
			return true;
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		int count=0;
		String s2 [] = s.split(" ");
		for(int i=0; i<s2.length; i++)
		{
			if(checkPallidrome(s2[i]))
				count++;
		}
		System.out.println("No of Pallidrome in "+s+": is "+count);
		sc.close();
	}
}
