import java.util.Scanner;
public class PrimeNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Limit");
		int n = sc.nextInt();
		System.out.println("Enter Upper Limit");
		int m = sc.nextInt();
		int count=0;
		boolean b= true;
		for(int i=n; i<=m; i++)
		{
			if(i<2)
				continue;
			int flag=0;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				if(b)
			{
				System.out.print(i+" ");
				b=false;
			}
			else
				count++;
			if(count==2)
			{
				b=true;
				count=0;
			}
			}
			sc.close();
		}
	}
}
