package Comparable;

class Book implements Comparable<Object>
{
	int pages;
	Book (int p)
	{
		pages=p;
	}
	public String toString()
	{
		return "Pages = "+pages;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return pages - ((Book)o).pages;
	}
}



public class Test1 {
	public static void main(String[] args) {
	Book b = new Book (10);
	Book b1 = new Book (10);
	Book b2 = new Book(100);
	Book b3 = new Book (8);
	System.out.println(b.compareTo(b1));
	System.out.println(b.compareTo(b2));
	System.out.println(b.compareTo(b3));
		
		
		
	}

}
