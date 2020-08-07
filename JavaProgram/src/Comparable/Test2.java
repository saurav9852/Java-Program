package Comparable;

import java.util.Arrays;
import java.util.Comparator;

 class Student implements Comparable<Object> 
{
    String name;
	Student (String s)
	{
		name=s;
	}
	@Override
	public String toString()
	{
		return "Name = "+name;
	}
	public int compareTo(Object o)
	{
		return name.charAt(0)-((Student)o).name.charAt(0);
	}
}
 
public class Test2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] arr = new Student[8];
		arr[0] = new Student("deepika");
		arr[1] = new Student("alia");
		arr[2] = new Student("katrina");
		arr[3] = new Student("karena");
		arr[4] = new Student("priyanka");
		arr[5] = new Student("bhoomi");
		arr[6] = new Student("sara");
		arr[7] = new Student("ananya");
		/*for(Student s:arr)
			System.out.println(s);
		}*/
		Arrays.sort(arr, new A());
		
		Arrays.sort(arr);
		
		for(Student s:arr)
			System.out.println(s);
		}
}
class A implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        return ((Student)o1).name.length()-((Student)o2).name.length();
    }
}