package StringOperation;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1=s;
		String s2="";
		while(s.length()>0)
		{
			int count=0;
			char ch = s.charAt(0);
			s1=s.replace(ch+"","");
			count=s.length()-s1.length();
			s2+=""+count+ch;
			s=s1;
		}
		System.out.println(s2);
		sc.close();
	}

}
