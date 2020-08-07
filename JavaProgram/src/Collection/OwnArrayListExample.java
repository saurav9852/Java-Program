package Collection;

public class OwnArrayListExample {

	public static void main(String[] args) {
		ArrayList1 a = new ArrayList1();
		a.add("Saurav");
		a.add("gaurav");
		a.add(5);
		a.add(985);
		a.add(977);
		System.out.println(a.size());
		System.out.println(a.get(1));
		a.add(0, "Butta");
		System.out.println(a.get(0));
		a.add(2, "Butta2");
		System.out.println(a.get(2));
		
		
	}
}
