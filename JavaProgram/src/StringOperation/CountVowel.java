package StringOperation;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				count++;
		}
		System.out.println("No of Vowels in "+s+" is " +count);
		sc.close();
	}
}
