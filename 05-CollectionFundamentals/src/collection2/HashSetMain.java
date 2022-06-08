package collection2;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		Student sObj1=new Student(100,"Siyal Patil",90);
		Student sObj2=new Student(101,"Shashank Patil",80);
		Student sObj3=new Student(101,"Shashank Patil",80);
		
		System.out.println(sObj1.hashCode());
		System.out.println(sObj2.hashCode());
		System.out.println(sObj3.hashCode());		

		HashSet<Student> set=new HashSet<>();
		set.add(sObj1);
		set.add(sObj2);
		set.add(sObj3);
		
		System.out.println(set);
	}

}
