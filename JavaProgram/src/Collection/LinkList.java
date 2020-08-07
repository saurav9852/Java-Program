package Collection;

public class LinkList
{
	private Node first = null;
	private int count=0;
	public void add(Object e)
	{
		if(first==null)
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
		last.next=new Node(e, null);
		count++;
	}
	public int size()
	{
		return count;
	}
	public void add(int index, Object e)
	{
		if(index>=size())
			throw new IndexOutOfBoundsException();
		if(index==0)
		{
			first = new Node(e, first);
			count++;
			return;
		}
		Node a = first;
		for(int i=1; i<index; i++)
		{
			a=a.next;
		}
		a.next = new Node(e, a.next);
		count++;
	}
	public Object get(int index)
	{
		if(index>=size())
			throw new IndexOutOfBoundsException();
		Node n = first;
		for(int i=1; i<index; i++)
		{
			n = n.next;
		}
		return n.e;
	}
	public void remove(int index)
	{
		if(index>=count)
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first = first.next;
			count--;
			return;
		}
		Node n = first;
		int i=0;
		while(i<index)
		{
			n = n.next;
			i++;
		}
		n.next = n.next.next;
		count--;
	}
	public String toString()
	{
		if(count==0)
			return "[ ]";
		String str = "["+ first.e;  
		Node n = first;
		while(n.next!=null)
		{
			n = n.next;
			str+=", "+ n.e;
		}
		str +=" ]";
		return str;
	}
}
