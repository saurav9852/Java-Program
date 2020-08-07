import java.util.Arrays;

public class Emp implements Comparable {
String name;
int id;
Emp (String s, int n)
{
	name = s;
	id = n;
}
	public int compareTo(Object o)
	{
		return id - ((Emp)o).id; 
	}
	public String toString()
	{
		return name;
	}
	public static void main(String[] args) {
		Emp arr[] = new Emp[5];
		arr[0] = new Emp("Saurav", 5);
		arr[1] = new Emp("gaurav", 7);
		arr[2] = new Emp("Deepika", 1);
		arr[3] = new Emp("Alia", 2);
		arr[4] = new Emp("Ranveer", 3);
		Arrays.sort(arr);
		for(Emp e: arr)
		{
			System.out.println(e);
		}
		
		
	}

}
