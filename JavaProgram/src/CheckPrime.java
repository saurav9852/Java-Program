import java.util.Scanner;
public class CheckPrime {
	static boolean checkPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		if(checkPrime(n))
			System.out.println(n+" is Prime Number");
		else
			System.out.println(n+" is not a Prime Number");
		sc.close();
	}

}
