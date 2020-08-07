package StringOperation;

import java.util.Scanner;

public class DistinctLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		while(s1.length()>0)
		{
			int count=0;
			char c= s1.charAt(0);
			String s2=s1.replace(c+"", "");
			count=s1.length()-s2.length();
			System.out.println(c+" no of Charcter is: "+count);
			s1=s2;
		}
		sc.close();
	}

}
