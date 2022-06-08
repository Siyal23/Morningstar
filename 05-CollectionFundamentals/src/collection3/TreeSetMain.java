package collection3;

import java.util.TreeSet;

public class TreeSetMain{

	public static void main(String[] args) {
		Student sObj1=new Student(100,"Siyal Patil",90);
		Student sObj2=new Student(101,"Shashank Patil",80);
	
		
		System.out.println(sObj1.hashCode());
		System.out.println(sObj2.hashCode());
			

		TreeSet<Student> set=new TreeSet<>();
		set.add(sObj1);
		set.add(sObj2);
	
		
		System.out.println(set);
	}

}
