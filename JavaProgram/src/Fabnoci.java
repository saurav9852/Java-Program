import java.util.Scanner;
public class Fabnoci {

	public static void main(String[] args) {
		int a=0; 
		int b=1; 
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n= sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=3; i<=n; i++)
		{
			c=a+b;
			System.out.print(" "+c+" ");
			a=b; 
			b=c;
		}
		sc.close();
	}

}
