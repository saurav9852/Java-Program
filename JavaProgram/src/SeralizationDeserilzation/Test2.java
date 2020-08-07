package SeralizationDeserilzation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {

	public static void main(String[] args)
	throws IOException, FileNotFoundException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		String path = "D:\\Core Java Program\\Serilzation\\A.ser";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new  ObjectInputStream(fis);
		A a1 = (A)ois.readObject();
		ois.close();
		System.out.println(a1.i);
		System.out.println(a1.j);
		

	}

}
