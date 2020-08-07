package Anonymousclass;

interface I 
{
	void m1();
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i1 = new I()
				{
					public void m1()
					{
						System.out.println("m1()");
					}
				};
				i1.m1();
	}

}
