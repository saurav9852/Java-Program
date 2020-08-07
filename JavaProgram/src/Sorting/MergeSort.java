package Sorting;

public class MergeSort {

	static void sort(int a[], int l, int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			sort(a, l, m);
			sort(a, m+1, r);
			merge(a, l, m, r);
		}
	}
	static void merge(int a[], int l, int m, int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i=0; i<n1; i++)
			L[i]=a[l+i];
		for(int i=0; i<n2; i++)
			R[i]=a[m+1+i];
		int i=0, j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<R[j])
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 2, 1, 8, 3};
		int l=0;
		int r=arr.length-1;
		sort(arr, l, r);
		for(int a1:arr)
			System.out.println(a1);
	}
}
