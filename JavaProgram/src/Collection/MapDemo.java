package Collection;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		Map m = new HashMap();
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+"," +i);
			}
			else
			{
				m.put(ch, i);
			}
		}
		System.out.println(m);
	}
}
