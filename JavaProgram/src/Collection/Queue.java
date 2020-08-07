package Collection;

public class Queue {
	private Node first= null;
	private int count =0; 
	public void add(Object e)
	{
		if(first == null)
		{
			first = new Node(e, null);
			count++; 
			return;
		}
		Node last = first;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next = new Node(e, null);
		count++;
	}
	public Object peek()
	{
		if(first == null) 
			return null;
		return first.e;
	}
	public Object poll()
	{
		if(first==null) 
			return null;
		Object e = first.e;
		first = first.next;
		count--;
		return e;
	}
	public int size()
	{
		return count;
	}
}
