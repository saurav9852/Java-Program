package StringOperation;

import java.util.Arrays;
import java.util.Scanner;


public class Test implements Comparable  {
	String name;
	public String toString()
	{
		return name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return name.charAt(0)-((Test)o).name.charAt(0);
	}
	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        String[] s1 = s.split("");
        String arr[] = new String[s.length()-(x-1)];
        int k=0;
        for(int i=0; i<s1.length-(x-1); i++)
        {
        	String s2 =s1[i];
        	for(int j=i+1; j<i+x; j++)
        	{
        		s2=s2+s1[j];
        	}
        	arr[k++]=s2;
        }
        int i=0;        
        while(i<s.length()-x)
        {
        	arr[i].compareTo(arr[i+1]);
        	i++;
        }
        Arrays.sort(arr);
        for(String a:arr)
        	System.out.println(a);
        
         sc.close();
    }



	
}