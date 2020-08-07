package FileOperation;

import java.io.File;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("D:\\Core Java Program\\FileOperation\\fol1\\A.txt");
		try{
			f1.createNewFile();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
