package StringOperation;

import java.util.Arrays;
import java.util.Scanner;
public class MyAnaogram {

	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int arr[] = new int[26];
		int arr1[] = new int[26];
		for(int i=0; i<s1.length(); i++)
		{
			arr[s1.charAt(i)-97]++;
		}
		for(int j=0; j<s2.length(); j++)
		{
			arr1[s2.charAt(j)-97]++;
		}
		if(Arrays.equals(arr, arr1))
		{
			System.out.println(s1+" and "+s2+" is an Anaogram String");
		}
		else
			System.out.println(s1+" and "+s2+" is not an Anaogram String");
		sc.close();
	}
}
