package innerclass;

class A
{
	int i=1;
	static int j=2;
	class B
	{
		 void m1()
		{
			System.out.println(i);
			System.out.println(j);
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		A.B obj2 = obj.new B();
		obj2.m1();
	}

}
