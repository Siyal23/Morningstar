package collection1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Capgemini");
		set.add("LTI");
		set.add("TCS");
		set.add("LTI");
		
		//set.add(1000);
		
		//System.out.println(set);
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + " - " + str.length());
		}
	}

}
