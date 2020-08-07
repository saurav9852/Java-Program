package SeralizationDeserilzation;

import java.io.*;

class A implements Serializable
{
	int i, j;
	A(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
}
public class Test1 {
	public static void main (String args [])
	throws FileNotFoundException, IOException
	{
		
		String path = "D:\\Core Java Program\\Serilzation\\A.ser";
		A a = new A(10, 20);
		FileOutputStream fo = new FileOutputStream(path);
		ObjectOutputStream o = new ObjectOutputStream(fo);
		o.writeObject(a);
		o.flush();
		o.close();
		System.out.println("Exceution Ends");
	}

}
