package collection1;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		hs.add("Morningstar");
		hs.add("JPM");
		hs.add("TCS");
		hs.add("Capgemini");
		hs.add("TCS");
		
		System.out.println(hs);
	}

}
