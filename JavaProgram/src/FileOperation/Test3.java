package FileOperation;
import java.io.*;

public class Test3 {

	public static void main(String[] args) 
	throws IOException
	{
		// TODO Auto-generated method stub
		FileWriter f1 = new FileWriter("D:\\Core Java Program\\FileOperation\\fol1\\A.txt");
		BufferedWriter bw = new BufferedWriter(f1);
		bw.write("Hello\n");
		bw.write("Stay At Home");
		bw.flush();
		bw.close();
		System.out.println("Exceution Ends");
	}

}
