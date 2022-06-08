package lambda4;

import java.util.Comparator;

public class StudentScoreSorter implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudScore() > o2.getStudScore()) {
			return 1;
		}
		else {
			return -1;
		}
	}



}
