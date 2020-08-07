package org.oar;

import java.util.Arrays;
import java.util.Scanner;

public class SchinChainProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int n = sc.nextInt();
		int a[] = new int [n];
		int count=0;					//1 2 3 4 5 6
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();			// 2 3 1 4
		}
		int a1[] = new int[n];				// 1 2 3 4
		for(int j=0; j<n; j++)
		{									// 2 3 4 5
			a1[j] = a[j];
		}
		Arrays.sort(a1);
		int a2[] = new int[n/2];
		int a3[] = new int[n/2];
		int even=0, odd=0;
		for(int k=0; k<n; k++)
		{
			if(a[k]%2==0)					// even 2, 4
			{		
				a2[odd]=a1[k];
				odd++;
			}
			else
			{
				a3[even]=a1[k];				// 
				even++;
			}
			
		}
		for(int x=0; x<a2.length; x++)
		{
			System.out.print("odd "+a2[x]);
		}
	    for(int x=0; x<a3.length; x++)
		{
			System.out.println("even "+a3[x]);
		}
		/*for(int j=1; j<=n; j++)
		{
			if(j%2==0)
			{
				 if(a[j]%2!=0)
				 {
					 a[j]=a2[odd];
					 odd++;
					 count++;
				 }
			}
			else
			{
				if(a[j]%2==0)
				{
					a[j] = a3[even];
					even++;
					count++;
				}
			}
		}
		*/
//		System.out.println(count);
		
		sc.close();
	}
}
