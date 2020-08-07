package StringOperation;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
				count++;
		}
		System.out.println(count);
		sc.close();
	}

}
