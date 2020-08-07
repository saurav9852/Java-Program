package FileOperation;
import java.io.*;

public class Test4 {

	public static void main(String[] args)
	throws IOException
	{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\Core Java Program\\FileOperation\\fol1\\A.txt");
		BufferedReader br = new BufferedReader(fr);
		String s1 = br.readLine();
		String s2 = br.readLine();
		br.close();
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
