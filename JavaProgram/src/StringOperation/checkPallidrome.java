package StringOperation;

import java.util.Scanner;

public class checkPallidrome {
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
	String s = sc.next();
	System.out.println(pallidrome(s));
	sc.close();
	}
}
