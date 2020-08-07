package Sorting;

public class QuiskSort {

	static void quicksort(int a[], int l, int r)
	{
		int pivot = a[(l+r)/2];
		int i=l;
		int j=r;
		while(i<=j)
		{
			while(a[i]<pivot)
				i++;
			while(a[j]>pivot)
				j--;
			if(i<j)
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
				j--;
			}
		}
		if(l<j)
			quicksort(a, l, j);
		if(i<r)
			quicksort(a, i, r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3, 7 ,8, 1, 2};
		int l=0;
		int r=a.length-1;
		quicksort(a , l, r);
		for(int a1:a)
			System.out.print(a1);
	}

}
