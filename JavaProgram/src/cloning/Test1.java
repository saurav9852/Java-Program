package cloning;


class Student implements Cloneable
{
	int roll;
	String s; 
	Student(int r, String s)
	{
		roll = r;
		this.s=s;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}


public class Test1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s1 = new Student (2, "Saurav");
		Student s2 = (Student)s1.clone();
		
		System.out.println(s1.roll+" , "+s1.s);
		System.out.println(s2.roll+" , "+s2.s);
		

	}

}
