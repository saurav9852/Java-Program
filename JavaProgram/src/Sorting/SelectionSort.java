package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {2, 7, 4, 1, 5, 3};
		for(int i=0; i<arr.length-1; i++)
		{
			int index =i; 
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}	
			}
			if(i!=index)
			{
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
