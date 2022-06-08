package collection4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMain{

	public static void printAll(List<Student> list) {
		for(Student student:list) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		Student sObj1=new Student(100,"Siyal Patil",90);
		Student sObj2=new Student(101,"Shashank Patil",89);
		Student sObj3=new Student(102,"Omkar",89);
		Student sObj4=new Student(103,"Harshal",88);
		Student sObj5=new Student(104,"Kulna",88);
	
		List<Student> list=new ArrayList<>();
		list.add(sObj1);
		list.add(sObj2);
		list.add(sObj3);
		list.add(sObj4);
		list.add(sObj5);
		Collections.sort(list,new StudentNameSorter());
		printAll(list);
	}

}
