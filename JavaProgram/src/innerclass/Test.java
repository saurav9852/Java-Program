package innerclass;

public class Test {
	private int i=1;
	private class B
	{
		void m1()
		{
			System.out.println(i++);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		Test.B t2 = t.new B();
		t2.m1();
	}

}
