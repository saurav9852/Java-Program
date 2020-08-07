package FileOperation;
import java.io.File;
import java.io.FileNotFoundException;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		File f1 = new File("D:\\Core Java Program\\FileOperation\\fol1");
		if(!f1.exists())
			f1.mkdir();
		System.out.println("Exceution Ends");
	}

}
