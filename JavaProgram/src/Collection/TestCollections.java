package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(20);
		a.add(60);
		a.add(10);
		a.add(30);
		a.add(40);
		a.add(60);
		Collections.sort(a);
		for(Object o:a)
			System.out.println(o);
		
		
	}

}
