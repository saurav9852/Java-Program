import java.util.Scanner;

public class ConvertEachCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); //Java //jAVA
		char c=0;
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>=97 & s.charAt(i)<=122)
			{
				c=Character.toUpperCase(s.charAt(i));
			}
			if(s.charAt(i)>=68 & s.charAt(i)<=94)
			{
				c=Character.toLowerCase(s.charAt(i));
			}
			s1=s1+c;
		}
		System.out.println(s1);
		sc.close();
	}

}
