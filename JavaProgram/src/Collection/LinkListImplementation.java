package Collection;

public class LinkListImplementation {
	
	public static void main(String[] args) {
	
		LinkList a = new LinkList();
		a.add("Gaurav");
		a.add("Ginny");
		System.out.println(a.get(0));
		System.out.println(a.size());
		a.add(0,"Ajay");
		System.out.println(a.get(1));
		System.out.println(a.size());
	}
}
