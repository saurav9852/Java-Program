package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {2, 3, 4, 1, 5, 0};
		for(int i=1; i<arr.length; i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int j:arr)
		{
			System.out.print(j);
		}
	}	
}

