package StringOperation;
import java.util.Scanner;

public class ConvertCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1="";
		for(int i=0;i<s.length(); i++)
		{
			char c=s.charAt(i);	
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				c=Character.toLowerCase(s.charAt(i));
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				c=Character.toUpperCase(s.charAt(i));	
			s1=s1+c+"";
		}
		System.out.println(s1);
		sc.close();
	}
}
