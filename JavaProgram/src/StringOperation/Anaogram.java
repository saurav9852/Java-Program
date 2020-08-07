package StringOperation;

import java.util.Scanner;

public class Anaogram {

	static boolean checkAnangram(String s1, String s2)
	{
		if(s1.length()!=s2.length()) 
			return false;
		while(s1.length()>0)
		{
			char c= s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
			if(s1.length()!=s2.length())
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(checkAnangram(s1, s2));
		sc.close();
	}
}
