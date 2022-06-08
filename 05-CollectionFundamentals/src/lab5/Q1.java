package lab5;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {

	public static void printAll(ArrayList<String> obj) {
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> sArr=new ArrayList<>();
		sArr.add("Siyal");
		sArr.add("Omkar");
		sArr.add("Kulna");
		printAll(sArr);
	}

}
