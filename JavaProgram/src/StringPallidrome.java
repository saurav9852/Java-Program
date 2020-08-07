import java.util.Scanner;

public class StringPallidrome {
	static boolean checkBoolean(String a)
	{
		String s=a.toLowerCase();
		int n = s.length();
		for(int i=0; i<n/2; i++)
		{
			if(s.charAt(i)!=s.charAt(n-1-i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		if(checkBoolean(s))
			System.out.println(s+" is a pallidrome");
		else
			System.out.println(s+" is not a pallidrome");
		sc.close();
	}

}
