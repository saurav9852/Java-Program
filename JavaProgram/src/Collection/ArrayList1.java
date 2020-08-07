package Collection;

public class ArrayList1 {
	private Object [] a = new Object[3];
	private int p = 0;
	public void add(Object e)
	{
			if(p>=a.length)
			{
				increase();
			}
			a[p++] = e;
	}
	public int size()
	{
		return p;
	}
	public Object get(int index)
	{
		if(index>=a.length)
		{
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public void add(int index, Object e)
	{
		if(index>=size())
			throw new IndexOutOfBoundsException();
		if(p>=a.length)
		{
			increase();
		}
			System.arraycopy(a, index, a, index+1, size()-index);
			a[index]=e;
			p++;
	}
	private void increase()
	{
		Object [] temp = new Object [a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public void remove(int index)
	{
		if(index>=size())
			throw new IndexOutOfBoundsException();
		System.arraycopy(a, index+1, a, index, size()-(index+1));
		a[--p]=null;
	}
	public void clear ()
	{
		a = new Object [3];
		p=0;
	}
}