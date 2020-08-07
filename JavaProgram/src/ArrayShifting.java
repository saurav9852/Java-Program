
public class ArrayShifting {
	public static void main (String args [])
	{
		int arr[] = {1, 2, 3, 4, 5, 6};
		int n = arr.length;
		for(int i=0;i<3; i++)
		{
			int y=n-1;
			int temp = arr[n-1];
			for(int j=0;j<n-1 && y>0; j++)
			{
				 arr[y] = arr[y-1];
				y--;
			}
			arr[0]=temp;
		}
	for(int z: arr)
	{
		System.out.print(z);
	}
}
}