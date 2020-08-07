package Collection;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue a = new Queue();
		a.add("Saurav Sinha");
		a.add("Sonu Kumar");
		a.add("Ram");
		System.out.println(a.size());
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a.size());
		System.out.println(a.peek());
	}

}
