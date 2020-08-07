package Collection;

public class Stack {
	private static final int MAX = 1000;
	private int top=-1;
	Object a[] = new Object[MAX];
	
	boolean isEmpty()
	{
		return (top<0);
	}
	
/*	Stack ()
	{
		top=-1;
	}
	*/
	public boolean push (Object e)
	{
		if(top>=(MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			a[++top]=e;
			System.out.println(e+" pushed into stack");
			return true;
		}
	}
	public Object pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return null;
		}
		else
		{
			Object e = a[top--];
			System.out.println(e+" pop out");
			return e;
		}
	}
	public Object peek()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return null;
		}
		else
		{
			Object e = a[top];
			return e;
		}
	}
	public int size()
	{
		return top+1;
	}
}


