package nestedclass;

class NestedClass
{
	static int i=5;
	static int j=10;
	static void m2()
	{
		System.out.println("m2()");
	}
	private static class B		// Nested Class
	{
		void m1()
		{
			int sum = i+j;
			System.out.println(sum);
			System.out.println(i++);
			m2();
			System.out.println(i);
		}
	}
	public static void main (String args [])
	{
		NestedClass.B obj = new NestedClass.B();
		obj.m1();
		
	}
}

