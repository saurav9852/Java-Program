import java.util.Scanner;

public class FabLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Limit");
		int n = sc.nextInt();
		System.out.println("Enter Upper Limit");
		int m = sc.nextInt();
		int a=0, b=1, c=0;
		if(n>=0)
		{
			if(n==0&&m==1)
			{
				System.out.print(a+" "+b);
				return;
			}
			if(n==0)
			{
				System.out.print(a+" "+b+" ");	
			for(;c<=m;)
			{
				c=a+b;
			if(c>=n&&c<=m)
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			}
			if(n==1)
			{
				System.out.print(b+" ");
			for(;c<=m;)
			{
				c=a+b;
				if(c>=n&&c<=m)
				System.out.print(c+" ");
				a=b;
				b=c;
		}
			}
			for(;c<=m;)
			{
				c=a+b;
				if(c>=n&&c<=m)
				System.out.print(c+" ");
				a=b;
				b=c;
		}
		}
		sc.close();
	}

}
